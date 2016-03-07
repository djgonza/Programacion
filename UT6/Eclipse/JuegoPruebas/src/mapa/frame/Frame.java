package mapa.frame;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import graficos.Pantalla;
import mapa.Mapa;
import mapa.Zona;
import mapa.frame.sprite.Sprite;

public class Frame {

	private int tipo;
	private ArrayList<Sprite> sprite;
	private int spriteMostrado;

	public Frame(int id, Mapa mapa) {

		this.sprite = new ArrayList<>();
		this.spriteMostrado = 0;

		try {

			JsonParser parser = new JsonParser();
			FileReader fr = new FileReader("recursos/mapa/frames.json");
			JsonElement data = parser.parse(fr);
			JsonObject frame = data.getAsJsonObject().get("frames").getAsJsonArray().get(id).getAsJsonObject();
			this.tipo = frame.get("tipo").getAsInt();
			Iterator<JsonElement> it = frame.get("sprites").getAsJsonArray().iterator();

			// cargamos los sprites al array list
			while (it.hasNext()) {
				this.sprite.add(new Sprite(it.next().getAsInt(), mapa));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void cargarPixeles(Zona zona, int xInicio, int yInicio) {

		Sprite sprite = cargarSprite();
		zona.setPixeles(sprite.getPixeles(), xInicio, yInicio);

	}

	private Sprite cargarSprite() {
		return sprite.get(spriteMostrado);
	}

	/*
	 * rota entre los sprites y recupera los pixeles del que toca
	 */
	public void mostrar(int xPantalla, int yPantalla, Pantalla pantalla) {

		Sprite sprite = this.sprite.get(spriteMostrado);
		pantalla.setPixel(xPantalla, yPantalla, sprite.getPixeles());

		// // compensacionX -= diferenciaX;
		// // compensacionY -= diferenciaY;
		// //
		// for (int y = 0; y < 32; y++) {
		//
		// int posicionY = y;
		//
		// for (int x = 0; x < 32; x++) {
		//
		// int posicionX = x;
		// if (posicionX < -32 || posicionX >= pantalla.getWidth() || posicionY
		// < 0
		// || posicionY >= pantalla.getHeight()) {
		// break;
		// }
		// if (posicionX < 0)
		// posicionX = 0;
		//
		// pantalla.setPixel(posicionX, posicionY, x, y, sprite.getPixeles());
		// }
		// }
	}

	public void rotarSprite() {
		// elegir sprite que toca
		if (spriteMostrado < sprite.size() - 1) {
			spriteMostrado++;
		} else {
			spriteMostrado = 0;
		}
	}

	public int getTipo() {
		return tipo;
	}

}
