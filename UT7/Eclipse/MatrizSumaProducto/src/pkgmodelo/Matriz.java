package pkgmodelo;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Matriz {

	private int[][] matriz;

	/**
	 * Constructor de la clase Matriz Crea una matriz vacía con el nº de filas y
	 * columnas especificado
	 * 
	 * @throws MatrizExcepcion
	 * 
	 */
	public Matriz(int filas, int columnas) {
		matriz = new int[filas][columnas];
	}

	/**
	 * obtiene el valor de una determinada fila y columna de la matriz
	 * 
	 */
	public int getValor(int f, int c) {
		return matriz[f][c];
	}

	/**
	 * accesor para las filas de la matriz
	 * 
	 * @return el n� de filas de la matriz
	 */
	public int getFilas() {
		return matriz[0].length;
	}

	/**
	 * accesor para las columnas de la matriz
	 * 
	 * @return el n� de columnas
	 */
	public int getColumnas() {
		return matriz.length;
	}

	/**
	 * mutador establece el nuevo valor en una fila y columnas determinadas
	 * 
	 * @param valor
	 *            el nuevo valor
	 * @param f
	 *            fila
	 * @param c
	 *            la columna
	 */
	public void setValor(int valor, int f, int c) {
		matriz[f][c] = valor;
	}

	/**
	 * Suma la matriz actual con la que recibe como par�metro
	 * 
	 * @param otra
	 *            la matriz a sumar con la actual
	 * @return Matriz la nueva matriz suma
	 * @throws IllegalArgumentException
	 *             si la matriz recibida no es correcta
	 */
	public Matriz sumar(Matriz otra) {

		Matriz aDevolver = new Matriz(getFilas(), getColumnas());

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				int valor = otra.getValor(i, j) + getValor(i, j);
				aDevolver.setValor(valor, i, j);
			}
		}

		return aDevolver;
	}

	/**
	 * Multiplica la matriz actual por otra
	 * 
	 * @param otra
	 *            el multiplicador
	 * @return Matriz la nueva matriz resultado del producto de dos matrices
	 * @throws IllegalArgumentException
	 *             si la matriz recibida no es correcta
	 */
	public Matriz multiplicar(Matriz otra) {
		Matriz aDevolver = new Matriz(getFilas(), getColumnas());

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				int valor = otra.getValor(i, j) * getValor(i, j);
				aDevolver.setValor(valor, i, j);
			}
		}

		return aDevolver;
	}

	/**
	 * @return String representación textual de la matriz
	 */
	public String toString() {

	}

	/**
	 * visualiza en un cuadro de diálogo una matriz
	 */
	public void escribirMatriz(String mensaje) {

		JTextArea areaTexto = new JTextArea(
				mensaje + "\n" + this.toString());
		areaTexto.setBackground(Color.lightGray);
		JOptionPane.showMessageDialog(null, areaTexto, mensaje,
				JOptionPane.ERROR_MESSAGE);
	}

}
