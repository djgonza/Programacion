package mapa.frame.sprite;

///generar un metodo que al pasarle un id genera un objeto de la propia clase hoja sprite

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HojaSprite {

	private int[] pixeles;
	private int ancho;
	private int alto;

	public HojaSprite(String nombre) {

		try {

			// sacar la ruta
			JsonParser parser = new JsonParser();
			FileReader fr = new FileReader("recursos/texturas/hojasSprites.json");
			JsonElement data = parser.parse(fr);
			JsonObject hojaSprite = data.getAsJsonObject().get(nombre).getAsJsonObject();

			this.ancho = hojaSprite.get("ancho").getAsInt();
			this.alto = hojaSprite.get("alto").getAsInt();

			BufferedImage imagen = ImageIO.read(new FileInputStream(hojaSprite.get("ruta").getAsString()));

			int w = imagen.getWidth();
			int h = imagen.getHeight();
			this.pixeles = imagen.getRGB(0, 0, w, h, null, 0, w);
			this.ancho = w;
			this.alto = h;

		} catch (IOException e1) {
			e1.printStackTrace();
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
