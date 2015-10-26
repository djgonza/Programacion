
import java.util.Scanner;

public class TestPersona
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);  // creamos el teclado
        
        // pedir datos al usuario (nombre, edad, sueldo y estado civil
        // crear un objeto Persona y
        // mostrar los datos de la persona  
        
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        System.out.print("Sueldo: ");
        double sueldo = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Estado: ");
        char estado = teclado.nextLine().charAt(0);
        
        Persona persona = new Persona(nombre, edad, sueldo, estado);
        
        System.out.print(persona.toString());
        
        
    }
}