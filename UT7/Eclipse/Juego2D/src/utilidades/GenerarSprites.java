package utilidades;

public class GenerarSprites {

	public static void generarJson() {

		System.out.println("{");
		System.out.println("\t\"sprites\": [");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("\t\t{");
				System.out.println("\t\t\t\"sprite\": {");
				System.out.println("\t\t\t\t\"ancho\": 32,");
				System.out.println("\t\t\t\t\"alto\": 32,");
				System.out.println("\t\t\t\t\"hojaSprite\": \"suelo\",");
				System.out.println("\t\t\t\t\"columna\": " + j + ",");
				System.out.println("\t\t\t\t\"fila\": " + i);
				System.out.println("\t\t\t}");
				if ((i * j) < 81) {
					System.out.println("\t\t},");
				} else {
					System.out.println("\t}]");
				}

			}
		}
		System.out.println("\t\n}");

	}
}
