
/**
 * La clase BaseDatos almacena objetos CD y Videos. 
 * Se puede imprimir una lista de CD y Videos.
 * Esta versi�n no guarda los datos en el disco y no proporciona
 * m�todos de b�squeda.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class BaseDatos
{
    private ArrayList<Articulo> articulos;

    /**
     * Construir una base de datos vac�a
     */
    public BaseDatos()
    {
        articulos = new ArrayList<Articulo>();
    }

    /**
     * A�adir un art�culo a la base da datos
     */
    public void addArticulo(Articulo elArticulo)
    {
        articulos.add(elArticulo);
    }

    /**
     * Imprimir una lista de tods los articulos almacenados, CD y Videos
     */
    public void listar()
    {
        for(Articulo articulo: articulos)
        {
            System.out.println(articulo);
        }
    }

    /**
     *  devuelve la cantidad de DVD en la base de datos
     *
     */
    public int totalDVD()
    {
        int cont = 0;
        for(Articulo articulo: articulos)
        {
            if(articulo instanceof DVD)
            {
                cont ++;
            }
        }
       return cont;
    }

    /**
     *  devuelve la duraci�n total entre todos los cd's
     *  Con iterador
     *
     */
    public int  totalDuracionCD()
    {
        int duracion = 0;
        Iterator<Articulo> it = articulos.iterator();
        while(it.hasNext())
        {
            Articulo articulo = it.next();
            if(articulo instanceof CD)
            {
                duracion += articulo.getDuracion();
            }
        }
        return duracion;

    }

    /**
     *  borrar todos los cd's
     *   
     *
     */
    public void  borrarCD()
    {
        Iterator<Articulo> it = articulos.iterator();
        while(it.hasNext())
        {
            Articulo articulo = it.next();
            if(articulo instanceof CD)
            {
                it.remove();
            }
        }   

    }
    
    /**
     *  cuenta los v�deos que hay con el formato indicado
     *
     */
    public int videosConFormato(String formato)
    {
        int contador = 0;
        for(Articulo articulo : articulos)
        {
            if(articulo instanceof Video)
            {
                Video v = (Video) articulo;
                if(v.getFormato().equalsIgnoreCase(formato))
                {
                    contador++;
                }
            }
        }
        return contador;

    }

}