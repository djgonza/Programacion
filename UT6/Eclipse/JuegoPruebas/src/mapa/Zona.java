package mapa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import control.Teclado;
import graficos.Pantalla;
import mapa.frame.Frame;

public class Zona {

	private ArrayList<Frame> frames;
	private int alto;
	private int ancho;
	private int x;
	private int y;
	private int coordenadaX;
	private int coordenadaY;
	private int[] pixeles;

	public Zona(String nombreZona, Mapa mapa) {

		this.frames = new ArrayList<>();

		try {

			JsonParser parser = new JsonParser();
			FileReader fr = new FileReader("recursos/mapa/zonas/" + nombreZona + ".json");
			JsonElement data = parser.parse(fr);
			JsonObject zona = data.getAsJsonObject().get(nombreZona).getAsJsonObject();

			// this.alto = zona.get("alto").getAsInt();
			// this.ancho = zona.get("ancho").getAsInt();
			//
			// Iterator<JsonElement> it =
			// zona.get("frames").getAsJsonArray().iterator();
			//
			// // // cargamos los frames al array list
			// while (it.hasNext()) {
			// frames.add(new Frame(it.next().getAsInt(), mapa));
			// }
			// cargarPixeles();

			// // temp
			// // long inicio = System.nanoTime();
			Random aleatorio = new Random();
			this.alto = 25;
			this.ancho = 25;
			for (int i = 0; i < alto * ancho; i++) {
				frames.add(new Frame(aleatorio.nextInt(21), mapa));
			}

			// fin temp
			// System.out.println(System.nanoTime() - inicio);

			cargarPixeles();
			inicializarTimer();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void inicializarTimer() {
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {

			@Override
			public void run() {
				for (int i = 0; i < frames.size(); i++) {
					frames.get(i).rotarSprite();
				}
				cargarPixeles();
			}

		};

		// tiempo en milisegundos que se actualizaran los sprites
		timer.schedule(timerTask, 0, 1000);

	}

	private void cargarPixeles() {

		this.pixeles = new int[(ancho * 32) * (alto * 32)];
		for (int y = 0; y < alto; y++) {
			for (int x = 0; x < ancho; x++) {
				frames.get(x + y * ancho).cargarPixeles(this, x * 32, y * 32);
			}
		}
	}

	public void mostrar(Pantalla pantalla, Teclado teclado) {

		if (teclado.arriva) {
			y += 1;
			if (y % 32 == 0) {
				coordenadaY++;
			}
		}

		if (teclado.abajo) {
			y -= 1;
			if (y % 32 == 0) {
				coordenadaY--;
			}
		}

		if (teclado.izquierda) {
			x += 1;
			if (x % 32 == 0) {
				coordenadaX++;
			}
		}

		if (teclado.derecha) {
			x -= 1;
			if (x % -32 == 0) {
				coordenadaX++;
			}
		}

		// for (int y = 0; y < pantalla.getHeight() >> 5; y++) {
		// for (int x = 0; x < pantalla.getWidth() >> 5; x++) {
		//
		// int indiceFrameX = ((pantalla.getWidth() >> 5) + x) + coordenadaX;
		// int indiceFrameY = ((pantalla.getHeight() >> 5) + y) + coordenadaY;
		// int indiceFrame = (indiceFrameX + indiceFrameY * ancho);
		//
		// if (indiceFrame > 0 && indiceFrame < frames.size())
		// frames.get(indiceFrame).mostrar((x << 5) + this.x, (y << 5) + this.y,
		// pantalla);
		//
		// }
		// }

		pantalla.setPixel(x, y, pixeles);

	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setPixeles(int[] pixeles, int xInicio, int yInicio) {
		int ancho = (int) Math.sqrt(pixeles.length);
		for (int y = 0; y < ancho; y++) {
			for (int x = 0; x < ancho; x++) {
				this.pixeles[(x + xInicio) + (y + yInicio) * (this.ancho * ancho)] = pixeles[x + y * ancho];
			}
		}
	}

	public void actualizar() {

	}

}
