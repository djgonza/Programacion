/**
 * Clase para probar la jerarquía de herencia
 *
 */
public class AppCuenta {

	/**
	 * 
	 */
	public static void main(String[] args) {

		CuentaAhorro cuentaUno = new CuentaAhorro("Elena", 1200, 0.02);
		CuentaCorriente cuentaDos = new CuentaCorriente("Juan", 1000, 600, 20);

		System.out.println(cuentaUno.toString());
		cuentaUno.ingresar(2000);
		cuentaUno.reintegrar(150);
		System.out.println(cuentaUno.toString());

		System.out.println();

		System.out.println(cuentaDos.toString());
		cuentaDos.reintegrar(500);
		System.out.println(cuentaDos.toString());
		cuentaDos.ingresar(2000);
		System.out.println(cuentaDos.toString());

	}

}
