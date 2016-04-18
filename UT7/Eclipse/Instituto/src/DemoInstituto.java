import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * Clase DemoInstituto
 * 
 * Prueba el resto de las clases
 */

public class DemoInstituto {
	private Instituto instituto;

	/**
	 * Constructor de la clase DemoInstituto
	 */
	public DemoInstituto() {
		instituto = new Instituto("IES M. Ana Sanz");
		altaPersonas();
	}

	/**
	 * Alta personas en el instituto
	 * 
	 * 
	 */
	public void altaPersonas() {

		instituto.altaPersona(new Profesor("P01", "Pedro",
				LocalDate.of(1970, Month.NOVEMBER, 1), "Informática",
				Dia.MARTES));
		instituto.altaPersona(new Profesor("P02", "Isabel",
				LocalDate.of(1972, Month.NOVEMBER, 5), "Informática",
				Dia.VIERNES));
		instituto.altaPersona(new Estudiante("E01", "Juan",
				LocalDate.of(1994, Month.APRIL, 13)));
		instituto.altaPersona(new Estudiante("E02", "Elena",
				LocalDate.of(1998, Month.MAY, 28)));
		instituto.altaPersona(new Profesor("P02", "Isabel",
				LocalDate.of(1972, Month.NOVEMBER, 5), "Informática",
				Dia.VIERNES));
		instituto.altaPersona(new Estudiante("E03", "Luis",
				LocalDate.of(1997, Month.JANUARY, 6)));
		instituto.altaPersona(new Profesor("P01", "Pedro",
				LocalDate.of(1970, Month.NOVEMBER, 1), "Informática",
				Dia.MARTES));
		instituto.altaPersona(new Estudiante("E04", "Ignacio",
				LocalDate.of(1996, Month.SEPTEMBER, 12)));
		instituto.altaPersona(new Estudiante("E02", "Elena",
				LocalDate.of(1998, Month.MAY, 28)));
		instituto.altaPersona(new Profesor("P03", "Carmen",
				LocalDate.of(1987, Month.FEBRUARY, 6), "Comercio",
				Dia.MARTES));

	}

	/**
	 * Mostrar las personas del instituo ordenadas de mayor a menor edad
	 */
	public void mostrarInstituto() {
		instituto.mostrar();
	}

	/**
	 * Mostrar profesores que dan conferencias un determinado día de la semana
	 *
	 * 
	 */
	public void demoQuienDaConferencias() {
		List<Profesor> lista = instituto.quienDaConferenciasEn(Dia.MARTES);
		System.out.println("\nProfesores que dan conferencias el Martes");
		for (Profesor p : lista) {
			System.out.println(p.toString());
		}
	}

	/**
	 * Demo cuantosEstudiantes()
	 *
	 * 
	 */
	public void demoTotalEstudiantes() {
		System.out.println("\nTotal estudiantes en el instituto "
				+ instituto.getNombre() + " : "
				+ instituto.cuantosEstudiantes());
	}

	/**
	 * Demo borrarEstudiantes()
	 *
	 * 
	 */
	public void demoBorrarEstudiantes(int edad) {
		List<Persona> borrados = instituto.borrarEstudiantes(edad);
		System.out.print("\nSe han borrado estudiantes de edad menor a "
				+ edad + "\n");
		if (borrados.size() != 0) {
			System.out.print(borrados.toString());
		} else {
			System.out.print("ninguno");
		}

	}

	/**
	 * Punto entrada a la aplicación
	 */
	public static void main(String[] args) {
		DemoInstituto demo = new DemoInstituto();
		demo.mostrarInstituto();
		demo.demoTotalEstudiantes();
		demo.demoQuienDaConferencias();
		demo.demoBorrarEstudiantes(20);
	}

}
