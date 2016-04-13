package pkgagenda.modelo;
/**
* Representa a un contacto en una agenda de contactos
**/

public abstract  class Contacto implements Comparable<Contacto> 
{

   private String nombre;
   private String telefono;
  
    /**
     * Constructor
     * 
     * @param  nombre el nombre  del contatco
     * @param telefono el tel�fono del contacto
     */
    public Contacto(String nombre, String telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
     public abstract String getFirmaEmail();
     
    /**
     * Accesor para el nombre
     */
    public String getNombre()
    {
        return nombre;
    }
    
      /**
     * Accesor para el tel�fono
     */
    public String getTelefono()
    {
        return telefono;
    }
    
    /**
     *  
     */
     public int compareTo(Contacto otro)
    {
        return nombre.compareTo(otro.getNombre());

    }
    
     /**
     * Accesor para la primera letra del nombre del contacto
     * La devuelve siempre en may�sculas
     */
    public Character getPrimeraLetra()
    {
         return Character.toUpperCase(nombre.charAt(0));
    }
    
    /**
     * Dos contactos son iguales si adem�s de ser del mismo tipo
     * tienen el mismo nombre y tel�fono   
     * 
     */
    public boolean equals(Object obj)
    {
        if(obj == null)
        return false;
        if(this.getClass() != obj.getClass())
        return false;
        if(this == obj)
        return true;
        
        Contacto otro = (Contacto) obj;
        return otro.getNombre().equalsIgnoreCase(this.nombre) &&
               otro.getTelefono().equalsIgnoreCase(this.telefono);
        
        
        
    }
    
   
    /**
     * toString()
     *  
     */
    public String toString()
    {
        return "Tipo de contacto " + this.getClass() + " Nombre : " + nombre + " Tel�fono : " +
                telefono; 
    }
    
      /**
     *  
     */
    public int hashCode()
    {
        return  nombre.hashCode() + telefono.hashCode();
    }
    
  
}
