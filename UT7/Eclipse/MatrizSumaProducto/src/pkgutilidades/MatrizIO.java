package pkgutilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import pkgmodelo.Matriz;

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
			String[] indices = linea.split(" ");

			arraydosd = new Matriz(Integer.parseInt(indices[0]),
					Integer.parseInt(indices[1]));

			int fila = 0;
			while (linea != null) {
				String[] valores = linea.split(" ");
				int col = 0;
				for (String valor : valores) {

					arraydosd.setValor(Integer.parseInt(valor), fila, col);
					col++;

				}

				fila++;
				linea = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

		File f = null;
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
