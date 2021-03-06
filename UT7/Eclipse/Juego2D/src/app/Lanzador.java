package app;

import control.Teclado;
import graficos.Pantalla;
import mapa.Mapa;

public class Lanzador {

	private Pantalla pantalla;
	private Mapa mapa;
	private Teclado teclado;

	private boolean enFuncionamiento = true;

	private void iniciar() {

		pantalla = new Pantalla();
		teclado = new Teclado();
		mapa = new Mapa(pantalla, teclado);
		pantalla.addKeyListener(teclado);

		int fps = 0;
		long contador = 0;

		while (enFuncionamiento) {

			long contCiclo = System.nanoTime();

			// limpiamos la pantalla
			pantalla.limpiar();
			// actualizamos el estado del teclado
			teclado.actualizar();
			// actualizamos el mapa
			// if (contador > 2500000)// actualizamos cada 1/4 segundo
			// mapa.actualizar();
			// cargamos el mapa en la pantalla
			mapa.mostrar();
			// mostramos la pantalla
			pantalla.mostrar();

			// contador para los fps
			contador += System.nanoTime() - contCiclo;
			fps++;
			if (contador > 1000000000) {
				pantalla.setFps(fps);
				fps = 0;
				contador = 0;
			}

		}

	}

	public static void main(String[] args) {
		Lanzador app = new Lanzador();
		app.iniciar();
	}

}
