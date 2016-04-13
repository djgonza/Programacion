package pkgagenda.modelo;
/**
 * Modela un contacto personal
 * 
 */

public class ContactoProfesional extends Contacto
{
    private String nombreEmpresa;

    /**
     * Constructor de objetos de la clase ContactoPersonal
     */
    public ContactoProfesional(String nombre, String telefono, String nombreEmpresa )
    {
        super(nombre, telefono);
        this.nombreEmpresa = nombreEmpresa;

    }
    /**
     *  
     */
    public String getNombreEmpresa()
    {
        return nombreEmpresa;

    }

    /**
     *  
     */
    public boolean equals(Object obj)
    {
        return super.equals(obj) && 
        nombreEmpresa.equalsIgnoreCase(((ContactoProfesional) obj).getNombreEmpresa()); 

    }

    

    /**
     *  
     */
    public String getFirmaEmail()
    {
        return "Atentamente, un saludo";

    }

  
    
    /**
     * toString()
     *  
     */
    public String toString()
    {
        return super.toString() + " Nombre Empresa " + nombreEmpresa;
    }

}
