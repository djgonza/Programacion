package pkgconcesionario.demo;

/**
 * Clase DemoConcesionario 
 * 
 *  
 */
import java.awt.Point;

import pkgconcesionario.modelo.CocheDeportivo;
import pkgconcesionario.modelo.CocheEconomico;
import pkgconcesionario.modelo.Concesionario;
import pkgconcesionario.modelo.Taxi;

public class DemoConcesionario {

	/**
	 * Acepta como argumento del main el nombre del concesionario Si no se pasa
	 * exactamente un argumento se muestra un mensaje de erro y el programa
	 * termina "Error de sintaxis, >java DemoConcesionario <nombre>" A
	 * continuaciñn se crea el concesionario, se añade los ccohes indicados y se
	 * invoca al resto de mñtodos
	 *
	 */
	public static void main(String[] args) {
		// completar

		Concesionario con = new Concesionario("AlvDavid");
		con.añadir(
				new CocheEconomico("ana", "ax", "verde", new Point(3, 3)));
		con.añadir(new CocheDeportivo("isabel", "lotus", "azul"));
		con.añadir(
				new Taxi("jesus", "c100", "blanco", new Point(30, 30), 5));
		con.añadir(new Taxi("manuel", "peugeot", "gris", new Point(10, 10),
				6));
		con.añadir(new CocheEconomico("luisa", "bmw", "naranja",
				new Point(0, 0)));

		con.listarPropietarios();
		con.listarCoches();
		con.avanzarTodos();
		con.listarCoches();
		con.borrarTaxis();
		con.borrarDeConductor("isabel");
		con.listarCoches();

	}

}
