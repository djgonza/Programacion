package pkgagenda.modelo;
import java.time.LocalDate;
/**
 * Modela un contacto personal
 * 
 */

public class ContactoPersonal  extends Contacto
{
    private Fecha fechaNacimiento;

    /**
     * Constructor de objetos de la clase ContactoPersonal
     */
    public ContactoPersonal(String nombre, String telefono, Fecha  fecha )
    {
        super(nombre, telefono);
        this.fechaNacimiento = fecha;

    }

    /**
     * toString()
     *  
     */
    public String toString()
    {
        return super.toString() + " Fecha " + fechaNacimiento.toString();

    }
    

    /**
     *  
     */
    public String  getFirmaEmail()
    {
        return " Con cari�o, adi�s ";
    }
    

    /**
     *  
     */
    public Fecha getFechaNacimiento()
    {

        return fechaNacimiento;
    }
    

    /**
     *  
     */
    public boolean equals(Object obj)
    {
  
        return super.equals(obj) && fechaNacimiento.equals(((ContactoPersonal) obj).getFechaNacimiento());

    }



    /**
     * M�todo que detecta si hoy es el cumplea�os
     * del contacto personal
     *
     * 
     * @return   true si lo es
     */
    public boolean esCumplea�os()
    {
        
//         System.out.println(LocalDate.now().getMonthValue() + " : " +
//                             fechaNacimiento.getMes() + " : " + 
//                             LocalDate.now().getDayOfWeek().getValue() + " : " + 
//                             fechaNacimiento.getDia());
        return LocalDate.now().getMonthValue() == fechaNacimiento.getMes() &&
        LocalDate.now().getDayOfMonth() == fechaNacimiento.getDia(); 

    }

   
}
