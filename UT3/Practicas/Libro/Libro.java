/**
 * Esta clase mantiene informaci�n sobre un libro.
 * Podr�a formar parte de una aplicaci�n m�s grande como un sistema que gestionase una librer�a, por ejemplo.
 *
 * @author (Introduce tu nombre)
 * @version (Inserta la fecha de hoy)
 */
public class Libro
{
    // los atributos
    private String autor;
    private String titulo;
    private int numPaginas;
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * establecer el autor y el t�tulo cunado el objeto se construya
     */
    public Libro(String queAutor, String queTitulo, int paginas)
    {
        autor = queAutor;
        titulo = queTitulo;
        numPaginas = paginas;
        numeroReferencia = "";
        vecesPrestado = 0;
    }

    /**
     *  getter autor
     */
    public String getAutor()
    {
        return this.autor;
    }
    
    /**
     * setter autor 
     */
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
     /**
     *  getter titulo
     */
    public String getTitulo()
    {
        return this.titulo;
    }
    
    /**
     * setter titulo 
     */
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    /**
     *  getter n� paginas
     */
    public int getNumPaginas()
    {
        return this.numPaginas;
    }
    
    /**
     * setter n� paginas
     */
    public void setNumPaginas(int numPaginas)
    {
        this.numPaginas = numPaginas;
    }
    
    /**
     *  getter numeroReferencia
     */
    public String getNumeroReferencia()
    {
        return this.numeroReferencia;
    }
    
    /**
     * setter numeroReferencia
     */
    public void setNumeroReferencia(String numeroReferencia)
    {
        this.numeroReferencia = numeroReferencia;
    }
    
    /**
     *  getter vecesPrestado
     */
    public int getVecesPrestado()
    {
        return this.vecesPrestado;
    }
    
    /**
     *  mostrar titulo
     */
    public void printTitulo()
    {
        System.out.println("T�tulo: " + this.titulo);
    }
    
    /**
     *  mostrar autor
     */
    public void printAutor()
    {
        System.out.println("Autor: " + this.autor);
    }
    
     /**
     *  mostrar detalles
     */
    public void printDetalles()
    {
        System.out.println("T�tulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("N�mero de P�ginas: " + this.numPaginas);
        System.out.println("N�mero de Referencia: " + this.numeroReferencia);
        System.out.println("Veces prestado: " + this.vecesPrestado);
    }
    
    /**
     *  metodo para contabilizar las veces que ha sido prestado un libro
     */
    public void prestar()
    {
        this.vecesPrestado++;
    }
    
    /**
     *  Representacion textual del objeto 
     */
    public String toString()
    {
        return "T�tulo: " + this.titulo +
               "\nAutor: " + this.autor +
               "\nN�mero de P�ginas: " + this.numPaginas +
               "\nN�mero de Referencia: " + this.numeroReferencia +
               "\nVeces prestado: " + this.vecesPrestado;
    }
    
    /**
     *  
     */
    public void print()
    {
        System.out.println(toString());
    }


}
