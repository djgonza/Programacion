package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener {

	private final static int numeroTeclas = 120;
	private final boolean[] teclas = new boolean[numeroTeclas];

	public boolean arriva;
	public boolean abajo;
	public boolean izquierda;
	public boolean derecha;

	public boolean salir;

	public Teclado() {
		this.arriva = false;
		this.abajo = false;
		this.izquierda = false;
		this.derecha = false;
		this.salir = false;
	}

	public void actualizar() {
		arriva = teclas[KeyEvent.VK_W];
		abajo = teclas[KeyEvent.VK_S];
		izquierda = teclas[KeyEvent.VK_A];
		derecha = teclas[KeyEvent.VK_D];
		salir = teclas[KeyEvent.VK_ESCAPE];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		teclas[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		teclas[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
