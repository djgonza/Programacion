package mapa;

import java.util.HashMap;

import control.Teclado;
import graficos.Pantalla;
import mapa.frame.sprite.HojaSprite;

public class Mapa {

	private Zona zona;

	public HashMap<String, HojaSprite> hojasSprites;

	public Mapa() {
		cargarHojasSprites();
		cargarZona("base", this);
	}

	private void cargarHojasSprites() {

		hojasSprites = new HashMap<>();
		hojasSprites.put("suelo", new HojaSprite("suelo"));

	}

	private void cargarZona(String nombreZona, Mapa mapa) {
		this.zona = new Zona(nombreZona, mapa);
	}

	public void mostrar(Pantalla pantalla, Teclado teclado) {
		pantalla.limpiar();
		zona.mostrar(pantalla, teclado);
	}

}
