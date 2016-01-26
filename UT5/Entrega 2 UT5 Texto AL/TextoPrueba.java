
/**
 *  class TextoPrueba  
 * 
 * @author  
 * @version  
 */
public class TextoPrueba
{
    private static final char ESPACIO = ' '; 
    private static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String[] frases;
    private int pos;

    /**
     * Constructor de la clase Texto
     * Crea el array frases e inicializa el resto de atributos
     * adecuadamente
     * 
     * @param tam el tamaño máximo del texto
     */
    public TextoPrueba(int tam)
    {
        frases = new String[tam];
        pos = 0;

    }

    /**
     *  se añade una nueva frase al texto siempre al final
     *  solo si no está completo
     *  previamente se han eliminado blancos a izquierda y
     *  derecha de frase
     *  
     */
    public void addFrase(String frase)
    {
        if (pos < frases.length)
            frases[pos] = frase;
        pos++;

    }

    /**
     *  return true si el array frases está completo, false en otro caso
     */
    public boolean textoCompleto()
    {
        return pos == frases.length;

    }

    /**
     *  devuelve el nº de frases del texto
     */
    public int getNumeroFrases()
    {
        return pos;

    }

    /**
     *  Devuelve true si p representa una 
     *  posición correcta del array (p está en el rango
     *  de posiciones en los que hay algún valor)
     */
    public boolean posicionCorrecta(int p)
    {

        return p >= 0 && p < pos;

    }

    //     public static int contarPalabras(String s) {
    //         int contador = 1, pos;
    //         s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final
    //         if (s.isEmpty()) { //si la cadena está vacía
    //             contador = 0;
    //         } else {
    //             pos = s.indexOf(" "); //se busca el primer espacio en blanco
    //             while (pos != -1) { //mientras que se encuentre un espacio en blanco
    //                 contador++; //se cuenta una palabra
    //                 pos = s.indexOf(" ", pos + 1); //se busca el siguiente espacio en blanco
    //             }                                               //a continuación del actual
    //         }
    //         return contador;
    //     }

    /**
     *  Dada una posición correcta devuelve el nº de palabras
     *  de la frase que está en dicha posición
     *     
     *  Devuelve  -1 si la posición es incorrecta
     *  
     *  Usar únicamente indexOf() y substring() de la clase String
     */
    public int  palabrasDeFrase(int p)
    {
        //         int cont = 0;
        //         int esp = 0;
        //         if(!posicionCorrecta(p))
        //             return -1;
        // 
        //         return contarPalabras(frases[p]);
        //         String aux = frases[p];
        //         int cont = 0;
        //         while(aux.indexOf(ESPACIO) >= 0){
        //             cont++;
        //             aux = aux.substring(aux.indexOf(ESPACIO)+1);
        //         }
        //         if(cont == 0) 
        //             return -1;
        //         else
        //             return cont;
        //         
        String aux = frases[p];
        int cont = 0;
        while(aux.indexOf(ESPACIO) >= 0){
            cont++;
            aux = aux.substring(aux.indexOf(ESPACIO) + 1);
        }
        
        if(cont == 0) 
            return -1;
        else
            return cont + 1;


    }
    
    
    /**
     *  Borra del texto las frases que tienen menos de n
     *  palabras. Devuelve la cantidad de frases borradas
     */
    public int borrarFrases(int n) {
        int cont = 0;
        for(int i = 0; i < pos; i++){
            if(palabrasDeFrase(i) < n){
                borraFrase(i);
                cont++;
            }
        }
        return cont;
    }

    /**
     *  Borra del texto las frases que tienen menos de n
     *  palabras. Devuelve la cantidad de frases borradas
     */
    public void borraFrase(int posicion) {
        System.arraycopy(frases, posicion+1, frases, posicion, 1);
        pos--;
    }

    public int[] frecuenciaCaracteres()
    {
        int[] aux = new int[ALFABETO.length()];

        for (int i=0; i<pos; i++) {
            for (int j=0; j<frases[i].length(); j++) {
                int aux2 = frases[i].toUpperCase().charAt(j);
                if (ALFABETO.indexOf(aux2) >= 0) {
                    aux[ALFABETO.indexOf(aux2)]++;
                }

            }
        }

        return aux;
    }
    
    public static void main (String[] args){
        TextoPrueba demo = new TextoPrueba(5);
        demo.addFrase("Hola como va");
        demo.addFrase("Mi ritmo");
        demo.addFrase("Bueno pa gozar");
        
        //System.out.print(demo.palabrasDeFrase(1));
        
        /*int[] aux = demo.frecuenciaCaracteres();
        
        System.out.println(ALFABETO);
        for(int i=0; i<aux.length; i++){
            System.out.print(aux[i]);
        }*/
        
        
        
    }
}
