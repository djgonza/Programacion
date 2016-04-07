
/**
 *  
 * 
 */
public   class Fichero  implements Comparable<Fichero>
{
    private String titulo;
    private int tamaño;

    /**
     * 
     */
    public Fichero(String titulo, int tamaño)
    {
        this.titulo = titulo;
        this.tamaño = tamaño;
    }

    /**
     *    
     */
    public int getTamaño()
    {
        return tamaño;        
    }

    /**
     *    
     */
    public String getTitulo()
    {
        return titulo;        
    }

    /**
     *    
     */
    public void display()
    {
      System.out.println("Titulo: " + titulo + " Tamaño: " + tamaño); 

    }

    /**
     *  
     */
    public int compareTo(Fichero otro)
    {
        return (int) (Math.signum(this.getTamaño() - otro.getTamaño()));

    }

    /**
     *  
     */
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        if (obj == this)
            return true;
        Fichero otro = (Fichero) obj;
        return otro.getTitulo().equalsIgnoreCase(this.getTitulo()) 
        && otro.getTamaño() == this.getTamaño();

    }

}
