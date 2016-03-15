package graficos;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

public class Pantalla extends Canvas {

	private static final long serialVersionUID = 1L;

	private JFrame pantalla;
	private static final int ANCHO = 1024;
	private static final int ALTO = 768;

	private BufferedImage imagen;
	public int[] pixeles;

	public Pantalla() {

		// preferencias de la ventana
		setPreferredSize(new Dimension(ANCHO, ALTO));
		pantalla = new JFrame("Nombre de la ventana");
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// pantalla.setResizable(false);
		pantalla.setLayout(new BorderLayout());
		pantalla.add(this, BorderLayout.CENTER);
		// pantalla.setUndecorated(true);
		pantalla.pack();
		pantalla.setLocationRelativeTo(null);
		pantalla.setVisible(true);
		requestFocus();

		this.imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);
		this.pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();

	}

	public void mostrar() {

		// buffer para las imagenes
		BufferStrategy buffer = getBufferStrategy();
		if (buffer == null) {
			createBufferStrategy(3);
			return;
		}

		// contexto para dibujar
		Graphics g = buffer.getDrawGraphics();
		// pintamos la imagen
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
		// personaje
		g.setColor(Color.white);
		g.fillRect(getWidth() / 2, getHeight() / 2, 32, 32);
		// limpiamos el jframe
		g.dispose();
		// mostramos el hilo
		buffer.show();

	}

	public void limpiar() {
		for (int i = 0; i < pixeles.length; i++) {
			pixeles[i] = 0;
		}
	}

	public void setPixel(int indice, int valor) {
		if (indice > 0 && indice < pixeles.length)
			this.pixeles[indice] = valor;
	}

	public void setPixel(int columna, int fila, int[] pixeles) {

		int length = pixeles.length;
		int ancho = (int) Math.sqrt(length);

		for (int y = 0; y < ancho; y++) {
			for (int x = 0; x < ancho; x++) {
				int indicePixeles = ((columna + x) + (fila + y) * ANCHO);
				if (indicePixeles > 0 && indicePixeles < this.pixeles.length)
					this.pixeles[indicePixeles] = pixeles[x + y * ancho];
			}
		}

	}

	public static int getAncho() {
		return ANCHO;
	}

	public static int getAlto() {
		return ALTO;
	}

}
