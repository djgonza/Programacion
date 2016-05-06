package pkgtest;

import pkgmodelo.Matriz;
import pkgmodelo.MatrizExcepcion;
import pkgutilidades.MatrizIO;

public class AppMatriz {

	/**
	 * @param args
	 * @throws MatrizExcepcion
	 * @throws IllegalArgumentException
	 */
	public static void main(String[] args)
			throws IllegalArgumentException, MatrizExcepcion {

		Matriz demoUno = MatrizIO.cargarDeFichero("matriz1.txt");
		Matriz demoDos = MatrizIO.cargarDeFichero("matriz2.txt");
		Matriz demoTres = MatrizIO.cargarDeFichero("matriz3.txt");

		System.out.println(demoUno.sumar(demoDos).toString());

		try {
			MatrizIO.salvarEnFichero(demoUno.sumar(demoDos), "suma.txt");

			MatrizIO.salvarEnFichero(demoUno.multiplicar(demoTres),
					"producto.txt");
		} catch (IllegalArgumentException | MatrizExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
