
/**
 *   clase DemoFiguras 
 * 
 * 
 */
import java.awt.Color;
public class DemoFiguras
{ 
    private GestorFiguras gestor;

    /**
     * Constructor de objetos de la clase DemoFiguras
     */
    public DemoFiguras()
    {
        gestor = new GestorFiguras();
    }

    /**
     * 
     */
    public void testAdd()
    {
        gestor.addFigura(new Circulo(4, 4, Color.red, 5.2));
        gestor.addFigura(new Circulo(4, 4, Color.red, 5.2));
        gestor.addFigura(new Circulo(1, 6, Color.yellow, 2));
        gestor.addFigura(new Cuadrado(0, 0, Color.green, 2));
        gestor.addFigura(new Cuadrado(0, 0, Color.green, 2));
        gestor.addFigura(new Cuadrado(14, 14, Color.pink, 12));
        gestor.addFigura(new Triangulo(4, 4, Color.green, 7, 7, 7));
        gestor.addFigura(new Triangulo(14, 14, Color.blue, 3,  11, 10));
    }

    /**
     * 
     */
    public void testEscribir()
    {
        gestor.listarFiguras();

    }

    /**
     * 
     */
    public void testMayorArea()
    {
        Figura f = gestor.mayorArea();
        System.out.println("Figura de mayor area : " + f.getClass().getName() + "\n" +
            String.format("%6.2f", f.area()));

    }

    /**
     * 
     */
    public void testOrdenarPorArea()
    {
        gestor.ordenarPorArea();

    }

    /**
     * 
     */
    public void testOrdenarPorPerimetro()
    {

        gestor.ordenarPorPerimetro();

    }
}
