import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *  @author -  David Jimenez
 *  
 *  Un objeto de esta clase guarda un texto que
 *  consta de una serie de frases
 *  Cada frase contiene varias palabras separadas
 *  por exactamente un espacio
 *  
 *  Toda frase tiene al menos una palabra
 *  
 */
public class Texto
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
    public Texto(int tam) {
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
    public void addFrase(String frase) {
        if (!textoCompleto()){
            frases[pos] = frase;
            pos++;
        }
    }

    /**
     *  return true si el array frases está completo, false en otro caso
     */
    public boolean textoCompleto() {
        return pos == frases.length;
    }

    /**
     *  devuelve el nº de frases del texto
     */
    public int getNumeroFrases() {
        return pos;
    }

    /**
     *  Devuelve true si p representa una 
     *  posición correcta del array (p está en el rango
     *  de posiciones en los que hay algún valor)
     */
    public boolean posicionCorrecta(int p) {
        return p >= 0 && p < pos;
    }

    /**
     *  Dada una posición correcta devuelve el nº de palabras
     *  de la frase que está en dicha posición
     *     
     *  Devuelve  -1 si la posición es incorrecta
     *  
     *  Usar únicamente indexOf() y substring() de la clase String
     */
    public int palabrasDeFrase(int p) {
        
        if(!posicionCorrecta(p)){
            return -1;
        }

        String aux = frases[p];
        int cont = 0;

        while(aux.indexOf(ESPACIO) >= 0){
            aux = 
                aux.substring(
                    aux.indexOf(ESPACIO) + 1
                );
            cont++;
        }

        if(cont == 0) 
            return -1;
        else
            return cont;

    }

    /**
     *  Borra del texto las frases que tienen menos de n
     *  palabras. Devuelve la cantidad de frases borradas
     */
    public int borrarFrases(int n) {

        int cont = 0;
        int i = 0;

        while(i < pos){
            if(palabrasDeFrase(i) < n){
                borraFrase(i);
                cont++;
            }else{
                i++;
            }
        }

        return cont;
    }

    /**
     *  Borra del texto las frases que tienen menos de n
     *  palabras. Devuelve la cantidad de frases borradas
     */
    public void borraFrase(int posicion) {
        
        System.arraycopy(
                frases,
                posicion + 1,
                frases, 
                posicion, 
                frases.length - posicion - 1
        );

        pos--;
    }


    /**
     *  Calcula y devuelve la frecuencia de aparición de cada una de las letras
     *  del alfabeto (mayúsculas) en el texto
     *   
     */
    public int[] frecuenciaCaracteres() {
        
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

    /**
     *  Representación textual del conjunto de fases del texto
     *  tal como pide el enunciado
     *  Usar StringBuilder
     */
    public String toString() {
        
        StringBuilder aux = new StringBuilder();

        for (int i=0; i<pos; i++) {
            aux.append("Frase ").append(i).append(": ");
            aux.append(frases[i]).append('\n');   
        }

        return aux.toString();
    }

    /**
     *  
     */
    public void printTexto() {
        System.out.println(this.toString());
    }

    /**
     *  Dada una posición correcta 
     *  crea y devuelve  un ragged array de caracteres con tantas filas como 
     *  nº de palabras tenga la frase de esa posición        
     *  Cada fila se asocia a una palabra y tendrá tantas columnas
     *  como caracteres tenga la palabra
     *  Si la posición es incorrecta se devuelve null
     *  
     * Ej. 
     * Si en el array frases hay:   "esto es un ejemplo"  "de texto"  "con varias"  "frases. Nos sirve para"  
     *                              "practicar"  "con arrays y con los"   
     *  
     *  y la posición  es 3  se devuelve el array de 2D de 4 filas
     *  
     *  f r a s e s .
     *  n o s
     *  s i r v e
     *  p a r a
     *  
     *  Se permite utilizar split()
     */
    public char[][] toArray2D(int p) {

        if(!posicionCorrecta(p))
            return null;

        String[] aux = frases[p].split(String.valueOf(ESPACIO));

        char[][] aRetornar = new char[aux.length][];

        for(int i = 0; i < aux.length; i++){

            aRetornar[i] = new char[aux[i].length()];

            for (int j = 0; j < aux[i].length(); j++) {
                
                aRetornar[i][j] = aux[i].charAt(j);

            }

        }

        return aRetornar;

    }

    /**
     *  Dada una posición (asumimos correcta) devuelve la frase 
     *  de esa posición encriptada
     *  
     *  Para encriptar se sustituye cada caracter letra de la frase 
     *  por el que está 4 veces más a la derecha  en el alfabeto definido 
     *  como constante . El resto de caracteres se quedan igual 
     *  
     *  La frase encriptada se devuelve en mayúsculas
     *  
     *  Se puede hacer usando como objeto de apoyo StringBuilder
     */
    public String encriptar(int p) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < frases[p].length(); i++){
            
            int aux = 
                ALFABETO.indexOf(
                    frases[p].toUpperCase().charAt(i)
                ) + 4;

            if(aux > ALFABETO.length()){
                aux = 
                    Math.abs(
                        (ALFABETO.length() - aux) - ALFABETO.length()
                    );
            }

            sb.append(
                ALFABETO.charAt(aux)
            );
        }

        return sb.toString();

    }

    /**
     * Lee de un fichero de texto una serie 
     * de frases con ayuda de un objeto de la 
     * clase Scanner y los almacena en el array
     */
    public void leerDeFichero() {
        try
        {
            Scanner sc = new Scanner(new File("texto.txt"));
            while (sc.hasNextLine() && !textoCompleto())
                addFrase(sc.nextLine());
            sc.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     *  Punto de entrada a la aplicación
     *  Código para probar los métodos de la clase Texto
     */
    public static void main(String[] args) {
        /*if (args.length != 1)
        {
            System.out.println("Error en nº argumentos, Sintaxis: java Texto <tam>");
            return;
        }*/

        //Texto texto = new Texto(Integer.parseInt(args[0]));

        /* Borrar */
        Texto texto = new Texto(15);


        texto.leerDeFichero();
        texto.printTexto();
        System.out.println("Total palabras en el texto " + texto.getNumeroFrases());
        System.out.println("--------------------------");
        int p = 3;
        int pal = texto.palabrasDeFrase(p);       
        if (pal != -1)
        {
            System.out.println("Palabras en la frase " + p + ": " +
                texto.palabrasDeFrase(p) + "\n");
        }
        else
        {
            System.out.println("Posición de frase incorrecta " + p);
        }
        p = 30;
        pal = texto.palabrasDeFrase(p);       
        if (pal != -1)
        {
            System.out.println("Palabras en la frase " + p + ": " +
                texto.palabrasDeFrase(p) + "\n");
        }        
        else
        {
            System.out.println("Posición de frase incorrecta " + p);
        }

        System.out.println("--------------------------");
        /* --------------------------------- */
        int numPal = 3;
        int borradas = texto.borrarFrases(numPal);
        System.out.println("Después de borrar " + borradas + " frases con menos de " + numPal + " palabras");
        texto.printTexto();

        System.out.println("--------------------------");
        System.out.println("Frecuencia de aparición de los caracteres del alfabeto en el texto ");
        System.out.println(Arrays.toString(texto.frecuenciaCaracteres()));        

        /* --------------------------------- */
        System.out.println("--------------------------");       
        p = 2;
        char[][] array2D = texto.toArray2D(p);
        System.out.println("Array de 2D creado a partir de la frase " + p);
        if (array2D != null)
        {
            for (char[] fila: array2D)
            {
                System.out.println(Arrays.toString(fila));
            }
        }

        /* --------------------------------- */
        System.out.println("--------------------------");       
        p = 1;      
        System.out.println("Frase " + p + " encriptada:" + texto.encriptar(p));       

    }

}
