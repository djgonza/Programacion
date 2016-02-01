import java.util.ArrayList;
import java.util.Iterator;
/**
 * Almacena detalles del club de miembros
 * 
 * Ejercicio 6.3 UT6
 * @author Kölling y Barnes
 */
public class Club
{
    private ArrayList<Miembro> miembros;

    /**
     * Constructor para los objetos de la clase Club
     */
    public Club()
    {
        miembros = new ArrayList<>();
    }

    /**
     * Añadir un nuevo miembro a la lista de miembros
     * @param miembro  El objeto Miembro a añadir
     */
    public void añadir(Miembro miembro)
    {
        miembros.add(miembro); 

    }

    /**
     * @return El nº de miembros del club
     */
    public int numeroMiembros()
    {
        return miembros.size();
    }

    /**
     * Devuelve
     * el nº de miembros que se incorporaron al club en el mes que se especifica como
     * parámetro. Si el mes está fuera de rango escribe un mensaje de error y devuelve -1.
     */
    public int incorporadoEnMes(int mes)
    {
        if(mes < 1 || mes > 12){
            System.out.println("Mes introducido incorrecto");
            return -1;
        }

        int cont = 0;

        for(Miembro aux : miembros){
            if(aux.getMes() == mes){
                cont ++;                
            }
        }

        return cont;

    }

    /**
     *  
     */
    public ArrayList<Miembro> borrar(int mes, int año)
    {
        ArrayList<Miembro> nuevo = new ArrayList<>(); 
        if(mes < 1 || mes > 12){
            System.out.println("Mes introducido incorrecto");
            return nuevo;
        }

        Iterator<Miembro> it= miembros.iterator();

        while(it.hasNext())
        {
            Miembro aux = it.next();
            if(aux.getMes() == mes && aux.getAño() == año)
            {
                nuevo.add(aux); 
                it.remove(); 

            }
        }
        return nuevo;

    }

    /**
     *  
     */
    public ArrayList<Miembro> borrarConWhile(int mes, int año)
    {
        ArrayList<Miembro> nuevo = new ArrayList<>(); 
        if(mes < 1 || mes > 12){
            System.out.println("Mes introducido incorrecto");
            return nuevo;
        }
        int i = 0;
        while (i < miembros.size())
        {
            Miembro aux = miembros.get(i);
            if(aux.getMes() == mes && aux.getAño() == año)
            {
                nuevo.add(aux);
                miembros.remove(aux);

            }else{
                i++;
            }

        }
        return nuevo;

    }
    /**
     *  
     */
    public ArrayList<Miembro> borrarConFor(int mes, int año)
    {
        ArrayList<Miembro> nuevo = new ArrayList<>(); 
        if(mes < 1 || mes > 12){
            System.out.println("Mes introducido incorrecto");
            return nuevo;
        }

        for(int i = miembros.size(); i >= 0 ; i--)
        {
            Miembro aux = miembros.get(i);
            if(aux.getMes() == mes && aux.getAño() == año)
            {
                nuevo.add(aux);
                miembros.remove(aux);

            }

        }
        return nuevo;
    }
    
    /**
     *  
     */
    public void listarClub()
    {
        for(Miembro aux: miembros)
        {
            System.out.println(aux.toString());
        }

    }

}



