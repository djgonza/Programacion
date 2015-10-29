public class Pruebas {
	private final double numero1;
	private final double numero2;

	public Pruebas (double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public void mostrar () {

		double numero = Math.floor(Math.random() * (this.numero1 - this.numero2) + this.numero2);
		System.out.println (numero);

	}

	public static void main(String[] args)
    {
        Pruebas ramdom = new Pruebas(5, 10);
        ramdom.mostrar();
        //System.out.println ("numero");
    }
}