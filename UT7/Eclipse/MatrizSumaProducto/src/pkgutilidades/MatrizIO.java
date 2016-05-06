package pkgutilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import pkgmodelo.Matriz;
import pkgmodelo.MatrizExcepcion;

public class MatrizIO {

	/**
	 * Crea y devuelve una matriz cargando sus valores a partir de un fichero de
	 * texto. La primera línea del fichero siempre contiene dos nºs, las filas y
	 * columnas de la natriz- Luego siguen tantas líneas de texto como marquen
	 * las filas y cada línea con tantos números como marquen las columnas. El
	 * separador es el tabulador ('\t')
	 * 
	 * 
	 * 
	 * 
	 */
	public static Matriz cargarDeFichero(String nombre) {
		File f = null;
		BufferedReader br = null;
		Matriz arraydosd = null;
		try {
			f = new File(nombre);
			br = new BufferedReader(new FileReader(f));
			String linea = br.readLine();
			Scanner sc = new Scanner(linea);

			arraydosd = new Matriz(sc.nextInt(), sc.nextInt());

			linea = br.readLine();

			int fila = 0;
			while (linea != null) {
				int col = 0;
				sc = new Scanner(linea);
				while (sc.hasNextInt()) {

					arraydosd.setValor(sc.nextInt(), fila, col);

					col++;

				}

				fila++;
				linea = br.readLine();
				sc.close();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MatrizExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally

		{
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return arraydosd;

	}

	/**
	 * 
	 * Guarda en el fichero especificado la matriz recibida como argumento La
	 * primera línea del fichero contendrá las filas y columnas de la matriz
	 * Luego habrá tantas líneas filas como filas tenga la matriz y en cada
	 * línea tantos números como columnas
	 * 
	 * 
	 */
	public static void salvarEnFichero(Matriz matriz, String nombre) {

		File f = new File(nombre);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(f));
			pw.println(matriz.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pw != null)
				pw.close();
		}
	}
}
