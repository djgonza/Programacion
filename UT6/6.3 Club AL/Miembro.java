/**
 * Alamcena detalles de un miembro del club
 * 
 * Ejercicio 6.3 UT6
 * @author Kölling y Barnes
 */

public class Miembro
{
    // El nombre del miembro
    private String nombre;
    // El mes en el que el miembro se inscribió al club
    private int mes;
    // El año en el que el miembro se inscribió al club
    private int año;

    /**
     * Constructor de la clase Miembro
     * @param nombre El nombre del miembro
     * @param mes El mes en el que el miembro se inscribió al club (1-12)
     * @param año El año en el que el miembro se inscribió al club
     */
    public Miembro(String nombre, int mes, int año)
             throws IllegalArgumentException
    {
        if  (mes < 1 || mes > 12)
		{
            throw new IllegalArgumentException(
                "Mes " + mes + "fuera del rango. Debe ser una valor entre 1 ... 12");
        }
        this.nombre = nombre;
        this.mes = mes;
        this.año = año;
    }
    
    /**
     * @return El nombre del miembro
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * @return El mes en el que el miembro se inscribió al club
     *        Un valor entre 1..12
     */
    public int getMes()
    {
        return mes;
    }

    /**
     * @return El año en el que el miembro se inscribió al club
     */
    public int getAño()
    {
        return año;
    }

    /**
     * @return Un string que representa al miembro
     */
    public String toString()
    {
        return "Nombre: " + nombre +
               " inscrito en el mes " +
               mes + " de " + año;
    }
}
