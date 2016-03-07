package app;

import control.Teclado;
import graficos.Pantalla;
import mapa.Mapa;

public class Lanzador implements Runnable {

	private static Thread graficos;
	private Pantalla pantalla;
	private Mapa mapa;
	private Teclado teclado;

	private int aps;
	private int fps;

	private static volatile boolean enFuncionamiento = false;

	@Override
	public void run() {

		final int NS_POR_SEGUNDO = 1000000000;
		final int APS_OBJETIVO = 60; // frames por segundo
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;

		long referenciaActualizacion = System.nanoTime();
		long referenciaContador = System.nanoTime();

		double tiempoTranscurrido;
		double delta = 0; // cantidad transcurrido hasta actualizacion

		teclado = new Teclado();
		mapa = new Mapa();
		pantalla = new Pantalla(mapa, teclado);
		pantalla.addKeyListener(teclado);

		while (enFuncionamiento) {

			final long inicioBucle = System.nanoTime(); // referencia del tiempo

			tiempoTranscurrido = inicioBucle - referenciaActualizacion;
			referenciaActualizacion = inicioBucle;

			delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;

			while (delta >= 1) {
				actualizar();
				delta--;
			}

			// contador de frames por segundo
			if (System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {
				pantalla.setAps(aps);
				pantalla.setFps(fps);
				aps = 0;
				fps = 0;
				referenciaContador = System.nanoTime();
			}

			pantalla.mostrar();

			fps++;

		}

	}

	private synchronized void iniciar() {
		enFuncionamiento = true;
		graficos = new Thread(this, "Graficos");
		graficos.start();
	}

	private synchronized void detener() {
		enFuncionamiento = false;
		try {
			graficos.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void actualizar() {

		teclado.actualizar();

		if (teclado.salir) {
			System.exit(0);
		}

		aps++;
	}

	public static void main(String[] args) {
		Lanzador app = new Lanzador();
		app.iniciar();
	}

}
