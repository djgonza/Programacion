
/**
 * Clase DemoGranja
 * 
 * @author
 * @version
 */
public class DemoGranja {

	private Granja g;

	/**
	 * Constructor de la clase DemoGranja
	 */
	public DemoGranja() {
		g = new Granja(10);
	}

	/**
	 * 
	 * @param
	 * @return
	 */
	public void testGranja() {
		g.addAnimal(new Perro("toby", 4, new Persona("pepe", 44), "sofa"));
		Animal a = new Gato("caty", 4, new Persona("juan", 12), "pelota");
		g.addAnimal(a);
		g.addAnimal(new Perro("churri", 4, new Persona("agust�n", 46),
				"suelo"));
		g.addAnimal(new Gato("pepi", 4, new Persona("luis", 23), "trapo"));
		g.addAnimal(new Vaca("manola", 4, new Persona("Federico", 55)));
		g.addAnimal(new Gato("max", 4, new Persona("ana", 15), "zapato"));
		g.addAnimal(new Gato("max", 4, new Persona("ana", 15), "zapato"));
		g.addAnimal(new Gato("max", 4, new Persona("ana", 15), "zapato"));
		g.addAnimal(new Vaca("manola", 4, new Persona("Federico", 55)));

		g.mostrarAnimales();
		System.out
				.println("Total perros en la granja " + g.cuantosPerros());
	}

	/**
	 * 
	 * @param
	 * @return
	 */
	public void testBorrarGatos() {
		g.borrarGatos();
		g.mostrarAnimales();
	}

	/**
	 * 
	 * @param
	 * @return
	 */
	public void testVacasIguales() {
		Vaca v = new Vaca("manola", 4, new Persona("Federico", 55));
		System.out
				.println("Vacas iguales a la dada " + g.vacasIgualesA(v));
	}

	public static void main(String[] args) {
		DemoGranja demo = new DemoGranja();
		demo.testGranja();
	}

}
