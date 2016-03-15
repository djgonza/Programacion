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

		while (enFuncionamiento) {
			// actualizamos el estado del teclado
			teclado.actualizar();
			// actualizamos el mapa
			mapa.actualizar();
			// cargamos el mapa en la pantalla
			mapa.mostrar();
			// mostramos la pantalla
			pantalla.mostrar();
			// limpiamos la pantalla
			pantalla.limpiar();
		}

	}

	public static void main(String[] args) {
		Lanzador app = new Lanzador();
		app.iniciar();
	}

}
