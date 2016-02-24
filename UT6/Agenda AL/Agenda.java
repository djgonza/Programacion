import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
/**
 * Una clase que mantiene una lista
 * con un nº arbitrario de notas.
 * Las notas se numeran de forma externa 
 * por el usuario
 */
public class Agenda
{
    // Almacén de notas
    private ArrayList<String> notas; 

    /**
     * Constructor
     */
    public Agenda()
    {
        notas = new ArrayList<>();

    }

    /**
     * Almacenar una nueva nota
     * @param nota La nota que se almacena
     */
    public void apuntarNota(String nota)
    {
        notas.add(nota);
    }

    /**
     * @return El nº de notas actualmente almacenadas
     */
    public int numeroNotas()
    {
        return notas.size();
    }

    /**
     * Mostrar una nota
     * @param numeroNota  El nº de nota a mostrar 
     * Si numeroNota es incorrecto mostrar mensaje de error
     */
    public void mostrarNota(int numeroNota)
    {
        if(numeroNota >= 0 && numeroNota < notas.size())
            System.out.println(notas.get(numeroNota).toString());
        else
            System.out.println("Error! posicion incorrecta");
    }

    /**
     * Borrar una nota
     * Si numeroNota es incorrecto mostrar mensaje de error
     */
    public void borrarNota(int numeroNota)
    {
        if(numeroNota >= 0 && numeroNota < notas.size())
            System.out.println(notas.remove(numeroNota));
        else
            System.out.println("Error! posicion incorrecta");

    }

    /**
     * Mostar todas las notas
     */
    public void listarNotas()
    {
        for(int i = 0; i> notas.size(); i++)
        {
            System.out.println(notas.get(i));
        }

    }

    /**
     * Mostar todas las notas con un for mejorado
     */
    public void listarNotasConForMejorado()
    {
        for(String aux : notas){
            System.out.println(aux);
        }
    }

    /**
     * Mostar todas las notas con un iterador
     */
    public void listarNotasConIterador()
    {
        Iterator<String> it = notas.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }
    }

    /**
     * contar las notas que contienen el parámetro
     * utilizando for mejorado
     */
    public  int notasQueContienen(String str)
    {
        int cont = 0;
        for(String nota:notas)
        {
            if(nota.contains(str))
            {
                cont++;
            }
        }
        return cont;

    }

    /**
     *   
     * borrar las notas que empiezan con el parámetro
     * utilizando un iterador
     */
    public  void borrarNotasQueEmpiezanPor(String str)
    {

        //         for(int i = notas.size()- 1 ; i >= 0 ; i--)
        //       {
        //           if(notas.get(i).startsWith(str))
        //             {
        //                 notas.remove(i);
        //             }
        //           
        //       }

        Iterator<String> it = notas.iterator();

        while(it.hasNext()){
            String nota = it.next();
            if(nota.startsWith(str))
            {
                it.remove();
            }

        }

    }

    /**
     * Devolver una colección con las notas que acaban en "ria"
     * ordenadas
     * Con for mejorado
     *
     */
    public ArrayList<String> acabanEn(String str)
    {
        ArrayList<String> resul = new ArrayList<>();
        for (String nota: notas)

        {
            if(nota.endsWith(str))
            {
                resul.add(nota);
            }
        }
        Collections.sort(resul);
        return resul;

    }
    
    public void duplicarNotas(){
        ArrayList<String> aux = new ArrayList<>();
        
        for(String nota : notas){
            aux.add(nota);
            aux.add(nota);
        }
        
        notas = aux;
    }
    
    public void invertirV1(){
        ArrayList<String> aux = new ArrayList<>();
        
        for(String nota : notas){
            aux.add(0,nota);
        }
        
        notas = aux;
    }
    
    public void invertirV2() {
        Collections.reverse(notas);
    }
    
    public void borrarRepetidas() {
        Iterator it = notas.iterator();
        while(it.hasNext()){
            notas.remove(notas.indexOf(it.next()));
        }
    }
    
    public void reorganizar(){
        Collections.shuffle(notas);
    }
}






















