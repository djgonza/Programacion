package mapa.frame.sprite;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mapa.Mapa;

public class Sprite {

	private int[] pixeles;
	private int ancho;
	private int alto;

	public Sprite(int idSprite, Mapa mapa) {

		try {

			JsonParser parser = new JsonParser();
			FileReader fr = new FileReader("recursos/texturas/sprites.json");
			JsonElement data = parser.parse(fr);
			JsonObject sprite = data.getAsJsonObject().get("sprites").getAsJsonArray().get(idSprite).getAsJsonObject()
					.getAsJsonObject("sprite");

			this.ancho = sprite.get("ancho").getAsInt();
			this.alto = sprite.get("alto").getAsInt();
			this.pixeles = new int[alto * ancho];

			cargarPixeles(mapa.hojasSprites.get(sprite.get("hojaSprite").getAsString()), sprite.get("fila").getAsInt(),
					sprite.get("columna").getAsInt());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void cargarPixeles(HojaSprite hojaSprite, int fila, int columna) {

		int[] pixelesHojaSprite = hojaSprite.getPixeles();
		int anchoHojaSprite = hojaSprite.getAncho();
		// int altoHojaSprite = hojaSprite.getAlto();

		int fSprite = 0;
		int cSprite = 0;

		for (int f = fila * alto; f < (fila * alto) + alto; f++) {
			for (int c = columna * ancho; c < (columna * ancho) + ancho; c++) {
				pixeles[cSprite + fSprite * ancho] = pixelesHojaSprite[c + f * anchoHojaSprite];
				if (cSprite < ancho - 1)
					cSprite++;
				else
					cSprite = 0;
			}
			fSprite++;
		}

	}

	public int[] getPixeles() {
		return pixeles;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}

}
