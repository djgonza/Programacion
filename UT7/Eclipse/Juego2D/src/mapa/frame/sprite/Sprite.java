package mapa.frame.sprite;

import java.awt.Color;
import java.util.ArrayList;

public class Sprite {

	private ArrayList<Color[]> pixeles;
	private int animacion;
	private int tiempoAnimacion;

	public Sprite(int[] pixeles) {

		this.pixeles = new ArrayList<>();
		addPixeles(pixeles);
		this.animacion = 0;
		this.tiempoAnimacion = 0;

	}

	public void addPixeles(int[] pixeles) {

		int ladoSprite = (int) Math.sqrt(pixeles.length);
		Color[] arrayColores = new Color[ladoSprite * ladoSprite];

		for (int y = 0; y < ladoSprite; y++) {
			for (int x = 0; x < ladoSprite; x++) {

				int pixel = pixeles[x + y * ladoSprite];

				int alpha = (pixel >> 24) & 0xff;
				int red = (pixel >> 16) & 0xff;
				int green = (pixel >> 8) & 0xff;
				int blue = (pixel >> 0) & 0xff;

				Color color = new Color(red, green, blue, alpha);
				arrayColores[x + y * ladoSprite] = color;

			}
		}

		this.pixeles.add(arrayColores);

	}

	public Color[] getPixeles() {
		return pixeles.get(animacion);
	}

	public void addAnimacion() {

	}

}
