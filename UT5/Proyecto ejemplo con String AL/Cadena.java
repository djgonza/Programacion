
/**
 * clase Cadena  
 * Modela una cadena de caracteres y sus
 * operaciones asociadas
 */
public class Cadena
{
    public static final String ESPACIO = " ";
    public static final String SEPARADOR = ":";
    private String cadena; // atributo que representa una cadena de caracteres

    /**
     * Constructor  
     */
    public Cadena(String cadena)
    {
        this.cadena = cadena;
    }

    /**
     * Constructor  
     */
    public Cadena(Cadena cadena)
    {
        this.cadena = new String(cadena.getCadena());
    }

    /**
     * Constructor  
     */
    public Cadena()
    {
        cadena = "Ejemplo:de:cadena:de:caracteres";
    }

    /**
     * accesor para la cadena 
     */
    public String getCadena()
    {
        return this.cadena;
    }

    /**
     * mutador para la cadena 
     */
    public void setCadena(String cadena)
    {
        this.cadena = cadena;
    }

    /**
     *  Longitud en caracteres de la cadena
     * 
     */
    public int longitud()
    { 
        return cadena.length();
    }

    /**
     *  devolver el primer caracter
     * 
     */
    public char primerCaracter()
    { 
        return cadena.charAt(0);  
    }

    /**
     *  devolver el último caracter
     * 
     */
    public char ultimoCaracter()
    { 
        return cadena.charAt(longitud() - 1); 
    }

    /**
     *  devolver el  caracter de posición p
     *  Lanzamos una excepción StringIndexOutOfBoundsException si p es incorrecta
     * 
     */
    public char caracterDePosicion(int p)
    { 
        //if(p<0 || p>longitud())
        // trow new StringIndexOutOfBoundsException("Error!");
        return cadena.charAt(p);
    }

    /**
     * concatena la cadena actual con la recibida como parámetro y devuelve un
     * nuevo objeto Cadena que la encapsula
     */
    public  Cadena concatenarCon(Cadena otra)
    {
        return new Cadena(this.cadena + otra.getCadena());
    }

    /**
     *  paso a mayúsculas
     * 
     */
    public void aMayusculas()
    { 
        this.cadena = cadena.toUpperCase();
    }

    /**
     *  paso a minúsculas
     * 
     */
    public void aMinusculas()
    { 
        this.cadena = cadena.toLowerCase();
    }

    /**
     *  devuelve true si las dos cadenas son iguales
     * 
     */
    public boolean igualQue(String cadena)
    { 
        return this.cadena.equals(cadena);
    }

    /**
     * devuelve true si la cadena del objeto es mayor que
     * la cadena recibidad como parámetro
     * 
     */
    public boolean mayorQue(String cadena)
    { 
        int aux = this.cadena.compareTo(cadena);
        if(aux > 0)
            return true;
        else
            return false;
    }

    /**
     * devuelve true si la cadena del objeto empieza por
     * la recibida como parámetro - da lo mismo mayúsculas que minúsculas
     * 
     * 
     */
    public boolean empiezaPor(String str)
    { 
        return this.cadena.toLowerCase().startsWith(str.toLowerCase());
    }

    /**
     * devuelve true si la cadena del objeto contiene a la recibida como parámetro
     * da lo mismo mayúsculas que minúsculas
     */
    public boolean contiene(String str)
    { 
        return this.cadena.toLowerCase().contains(str.toLowerCase());
    }

    /**
     *   localiza la última aparición de str en cadena y extrae , a partir de ahí, 
     *   la subcadena existente hasta el final
     *  Si no existe str devuelve null
     */
    public String cadenaApartirDe(String str)
    {
        int pos = this.cadena.lastIndexOf(str);
        if(pos == -1)
            return null;
        return this.cadena.substring(pos);
    }

    /**
     * Cuenta el nº de 'A'
     */
    public  int cuantasA()
    {
        int veces = 0;
        for (int i = 0; i < this.longitud(); i++){
            if(this.cadena.charAt(i) == 'A')
                veces++;
        }
        return veces;
    }

    /**
     * Devuelve un objeto Cadena con la cadena actual invertida
     */
    public Cadena invertir()
    {
        String retorna = "";
        for(int i=this.longitud(); i>0; i--){
            retorna += this.cadena.charAt(i);
        }
        return new Cadena(retorna);
    }

    /**
     * llama a invertirRecursivo
     */
    public Cadena invertirV2()
    {

    }

    /**
     * invertirRecursivo
     */
    private String invertirRecursivo(String str)
    {

    }

    /**
     * Devuelve true si la cadena es un palíndromo
     * Versión iterativa
     */
    public  boolean esPalindromaIterativa()
    {
        for(int i=0; i<this.longitud()/2; i++){
            if(this.cadena.charAt(i) != this.cadena.charAt(this.longitud()-i-1))
                return false;
        }
        return true;
    }

    /**
     * Devuelve true si la cadena es un palíndromo
     * Versión recursiva
     */
    public  boolean esPalindromaRecursiva()
    {
        return esPalindromaRecursiva(this.cadena);
    }

    /**
     *  
     *
     */
    private boolean esPalindromaRecursiva(String cadena)
    {
        if(cadena.length() == 0 || cadena.length() == 1)
            return true;
        if(cadena.charAt(0) == cadena.charAt(cadena.length()-1))
            return esPalindromaRecursiva(cadena.substring(1, cadena.length() - 1));
        return false;
    }

    /**
     * Devuelve los tres últimos caracteres de la cadena
     */
    public String tresUltimosCaracteres()
    {

    }

    /**
     * Si la cadena es "ejemplo" 
     * hay que escribir
     * e
     * ej
     * eje
     * ejem
     * ejemp
     * ejempl
     * ejemplo
     * 
     *  
     */
    public  void visualizarEnTrozos()
    {

    }

    /**
     *  
     * Si la cadena es "ejemplo" 
     * hay que mostrar
     * e
     *  j
     *   e
     *    m
     *     p
     *      l
     *       o
     * 
     */
    public  void visualizarEnDiagonal()
    {

    }

    /**
     * @param otra la cadena con la que comparar
     * @return true si la cadena actual empieza y termina por el mismo 
     * caracter que otra
     */
    public  boolean  empiezaYterminaIgualQue(Cadena otra)
    {

    }

    /**
     * @param objetivo el caracter a buscar en la cadena actual
     *  @param nuevo  el caracter por el que se reemplazará
     *  
     */
    public  void reemplazarPor(char objetivo, char nuevo)
    {

    }

    /**
     *  Contar las palabras de cadena, el separador entre palabras es
     *  el carácter SEPARADOR
     *
     */
    public int numeroPalabras()
    {

    }

    /**
     *  Cuenta las apariciones de str en cadena
     *  Sin diferenciar mayúculas de minúsculas
     *  Usar indexOf() y substring()
     */
    public int aparicionesDe(String str)
    {

    }

    /**
     *  Cuenta las apariciones de str en cadena
     *  Sin diferenciar mayúculas de minúsculas
     *  Usar solo indexOf()  
     */
    public int aparicionesDeV2(String str)
    {

    }
}
