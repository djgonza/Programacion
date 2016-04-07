
/**
 *  
 * 
 */
public   class Fichero  implements Comparable<Fichero>
{
    private String titulo;
    private int tama�o;

    /**
     * 
     */
    public Fichero(String titulo, int tama�o)
    {
        this.titulo = titulo;
        this.tama�o = tama�o;
    }

    /**
     *    
     */
    public int getTama�o()
    {
        return tama�o;        
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
      System.out.println("Titulo: " + titulo + " Tama�o: " + tama�o); 

    }

    /**
     *  
     */
    public int compareTo(Fichero otro)
    {
        return (int) (Math.signum(this.getTama�o() - otro.getTama�o()));

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
        && otro.getTama�o() == this.getTama�o();

    }

}
