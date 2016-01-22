import java.util.Random;
import java.util.Arrays;

/**
 *  
 * Representa a un CD 
 */
public class CD
{
    private String titulo;
    private String artista;
    private Cancion[] canciones;
    private int pos; // total canciones en el CD
    private Random aleatorio;

    /**
     * Constructor  
     */
    public CD(int n, String titulo, String artista)
    {
        canciones = new Cancion[n];
        this.titulo = titulo;
        this.artista = artista;
        aleatorio = new Random();
        pos = 0;
    }

    /**
     *  añade una canción al CD  solo si no está completo
     * 
     * @param  c la canción a añadir 
     * 
     */
    public void addCancion(Cancion c)
    {
        if(!estaCompleto()){
            canciones[pos] = c;
            pos++;
        }
    }

    /**
     *  añade una canción al CD  solo si no está completo
     * 
     * @param  titulo el título de  la canción a añadir 
     * @param  duracion la duración de  la canción a añadir 
     * 
     */
    public void addCancion(String titulo, double duracion)
    {
        if(!estaCompleto()){
            Cancion aux = new Cancion(titulo, duracion);
            canciones[pos] = aux;
            pos++;
        }
    }

    /**
     * devuelve true si el cd está lleno
     */
    public  boolean estaCompleto()
    {
        return canciones.length == pos;
    }

    /**
     * devuelve el total de canciones en el CD
     */
    public  int totalCanciones()
    {
        return pos;
    }

    /**
     * Duración total del CD
     */
    public  double duracionTotal()
    {
        double aux = 0;
        for(int i=0; i<pos; i++){
            aux += canciones[i].getDuracion();
        }
        return aux;
    }

    /**
     * Devuelve una canción aleatoria del CD
     */
    public  Cancion getAleatoria()
    {
        if(pos == 0)
            return null;
        return canciones[aleatorio.nextInt(pos)];
    }

    /**
     * Devuelve un  array con los títulos de las canciones en mayúsculas
     */
    public  String[] getTitulos()
    {
        String[] aux = new String[pos];
        for(int i=0; i<pos; i++){
            aux[i] = canciones[i].getTitulo();
        }
        return aux;
    }

    /**
     * Devuelve cuántas canciones contienen en el título una cadena
     */
    public  int cancionesQueContienen(String str)
    {
        int cont = 0;
        for(int i=0; i<pos; i++){
            if(canciones[i].getTitulo().indexOf(str) < 0){
                cont++;
            }
        }
        return cont;
    }

    /**
     * Borra las canciones que empiezan por una cadena devolviendo los títulos
     * que se han borrado. Si no hay ninguna se devuelve null
     */
    public String[] borrarCancionesQueEmpiezan(String str)
    {
        if(pos == 0) 
            return null;
        String[] titulosCanciones = new String[pos];
        int cont = 0;
        int i = 0;
        while(i<pos){
            if(canciones[i].getTitulo().startsWith(str)){
                titulosCanciones[cont] = canciones[i].getTitulo();
                borrarCancion(i);
                cont++;
                i--;
            }
            i++;
        }
        return Arrays.copyOf(titulosCanciones,cont);
    }

    /**
     * Borra una canción, la que está en la posición p
     */
    private void borrarCancion(int p)
    {
        while(p<pos-1){
            canciones[p] = canciones[p+1];
            p++;
        }
        pos--;
    }

    /**
     * Obtener un array con las canciones ordenadas por título
     * Método de selección directa
     */
    public  Cancion[] cancionesOrdenadasPorTitulo()
    {
        return ordenarSeleccionDirecta(Arrays.copyOf(this.canciones, pos));
    }

    /**
     *  Ordenar en orden ascendente
     */
    public Cancion[]  ordenarSeleccionDirecta(Cancion[] array)
    {
        int posmin;
        Cancion aux;
        for (int i = 0; i < array.length - 1; i++)
        {
            posmin = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j].getTitulo().compareTo(array[posmin].getTitulo()) < 0)
                    posmin = j;
            }
            aux = array[posmin];
            array[posmin] = array[i];
            array[i] = aux;
        }
        return array;
    }

    
     /**
     *  Crea  y devuelve un nuevo CD con las canciones ordenadas por título
     *
     */
    public CD crearNuevoCD()
    {
        Cancion[] auxCanciones = cancionesOrdenadasPorTitulo();
        CD aux = new CD(auxCanciones.length, this.titulo, this.artista);
        for(int i=0; i<auxCanciones.length; i++){
            aux.addCancion(auxCanciones[i]);
        }
        
        System.out.println(aux.toString());
        
        return aux;
    }
      
    /**
     * Representación textual del CD
     * De forma eficiente usando StringBuilder
     */
    public  String toString()
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<pos; i++){
            sb.append(canciones[i].toString());
            sb.append('\n');
        }

        return sb.toString();

    }
}
