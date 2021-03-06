package mapa.frame;

import java.awt.Color;
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
	 * carga los pixeles de los sprites en el mapa
	 */
	public void mostrar() {

		Color[] pixelesFormateados = new Color[32 * 32];

		for (Sprite sprite : sprites) {

			Color[] pixeles = sprite.getPixeles();
			int ladoSprite = (int) Math.sqrt(pixeles.length);

			for (int y = 0; y < ladoSprite; y++) {
				for (int x = 0; x < ladoSprite; x++) {

					Color color = pixeles[x + y * ladoSprite];
					if (pixelesFormateados[x + y * ladoSprite] == null)
						pixelesFormateados[x + y * ladoSprite] = color;
					else {

						if (color.getAlpha() > 0) {

							int r = (color.getRed() + pixelesFormateados[x
									+ y * ladoSprite].getRed()) / 2;
							int g = (color.getGreen()
									+ pixelesFormateados[x
											+ y * ladoSprite].getGreen())
									/ 2;
							int b = (color.getBlue() + pixelesFormateados[x
									+ y * ladoSprite].getBlue()) / 2;

							int a = pixelesFormateados[x + y * ladoSprite]
									.getAlpha();

							pixelesFormateados[x
									+ y * ladoSprite] = new Color(r, g, b,
											a);
						}

					}

				}
			}

		}

		for (int y = 0; y < 32; y++) {
			for (int x = 0; x < 32; x++) {
				Color color = pixelesFormateados[x + y * 32];
				mapa.setPixeles(
						(this.x + x) + (this.y + y) * mapa.getAncho(),
						color.getRGB());
			}

		}

	}

	public void addSprite(Sprite sprite) {
		this.sprites.add(sprite);
	}

}
