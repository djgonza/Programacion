package utilidades;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MostrarImagen extends Canvas {

	private static final long serialVersionUID = 1L;

	private JFrame pantalla;
	private static final int ANCHO = 1024;
	private static final int ALTO = 768;

	private BufferedImage imagen;
	private int[] pixeles;

	public MostrarImagen() {

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

		this.imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_ARGB);
		this.pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();

		try {
			BufferedImage imagen = ImageIO.read(new FileInputStream("recursos/texturas/grass.png"));
			int[] pixeles = imagen.getRGB(0, 0, 32, 32, null, 0, 32);

			for (int y = 0; y < Math.sqrt(pixeles.length); y++) {
				for (int x = 0; x < Math.sqrt(pixeles.length); x++) {

					int pixel = pixeles[x + y * (int) Math.sqrt(pixeles.length)];

					int alpha = (pixel >> 24) & 0xff;
					int red = (pixel >> 16) & 0xff;
					int green = (pixel >> 8) & 0xff;
					int blue = (pixel >> 0) & 0xff;

					Color color = new Color(red, green, blue, alpha);

					System.out.println(alpha);

					if (alpha > 0)
						this.pixeles[x + y * getWidth()] = color.getRGB();
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mostrar();
		mostrar();

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
		// limpiamos el jframe
		g.dispose();
		// mostramos el hilo
		buffer.show();

	}

	public static void main(String[] args) {
		MostrarImagen demo = new MostrarImagen();
		demo.mostrar();
	}

}
