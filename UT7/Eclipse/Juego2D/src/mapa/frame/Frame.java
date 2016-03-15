package mapa.frame;

import java.util.ArrayList;

import mapa.Mapa;
import mapa.frame.sprite.Sprite;

public class Frame {

	private ArrayList<Sprite> sprites;

	private int x;
	private int y;
	private Mapa mapa;

	public Frame(int x, int y, Mapa mapa) {

		this.mapa = mapa;
		this.sprites = new ArrayList<>();
		this.x = x;
		this.y = y;

	}

	/*
	 * 
	 */
	public void mostrar() {

		for (Sprite sprite : sprites) {

			int[] pixeles = sprite.getPixeles();
			int ancho = (int) Math.sqrt(pixeles.length);

			for (int y = 0; y < ancho; y++) {
				for (int x = 0; x < ancho; x++) {
					int colorPixel = pixeles[x + y * ancho];
					mapa.setPixeles((this.x + x) + (this.y + y) * mapa.getAncho(), colorPixel);
				}
			}

		}

	}

	public void addSprite(Sprite sprite) {
		this.sprites.add(sprite);
	}

}
