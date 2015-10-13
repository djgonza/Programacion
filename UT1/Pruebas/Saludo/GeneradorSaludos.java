
/**
 * Clase cuyos objetos generan saludos
 * 
 */
 import  javax.swing.JOptionPane;
 public class GeneradorSaludos
{
    
    private String mensaje;

    /**
     * Constructor de objetos de la
     * clase GeneradorSaludos
     */
    public GeneradorSaludos()
    {
        mensaje = "\nSaludo en modo texto \n\nBienvenido/a al curso de programación \n" + 
                   "orientada a objetos en Java utilizando BlueJ";
    }

    /**
     * Emite un saludo inicial al usuario  
     */
    public void emitirSaludo()
    {
       // borrarPantalla();
        System.out.println(mensaje);
    }
	
	 /**
     * Emite un saludo inicial al usuario  
     */
    public void emitirSaludoConGui()
    {
        JOptionPane.showMessageDialog(null, 
					"<html><p style ='color: red'>Saludo en modo gráfico </p></html>" +  
					"\n\nBienvenido/a al curso de programación orientada a objetos\n en Java utilizando BlueJ",
					"Ejemplo de prueba", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Limpia el terminal
     *   
     */
    private void borrarPantalla()
    {
        System.out.print('\u000C');
    }
    
    
    
}
