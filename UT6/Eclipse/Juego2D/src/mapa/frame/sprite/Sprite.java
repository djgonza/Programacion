package mapa.frame.sprite;

import java.util.ArrayList;

public class Sprite {

	private ArrayList<int[]> pixeles;
	private int animacion;
	private int tiempoAnimacion;

	public Sprite(int[] pixeles) {

		this.pixeles = new ArrayList<>();
		this.pixeles.add(pixeles);
		this.animacion = 0;
		this.tiempoAnimacion = 0;

	}

	public int[] getPixeles() {
		return pixeles.get(animacion);
	}

	public void addAnimacion() {

	}

}
