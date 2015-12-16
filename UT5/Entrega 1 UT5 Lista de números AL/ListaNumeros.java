import java.util.Arrays;
/**
 * La clase representa a una lista de 
 * numeros enteros
 * 
 */
 
public class ListaNumeros
{  
    private int[] lista;  // la lista de elementos
    private int pos;  // n� real de elementos en la lista

    /**
     * Constructor de la clase ListaNumeros
     * @param n el tama�o m�ximo de la lista
     */
    public ListaNumeros(int n)
    {
     	lista = new int[n];
     	pos = 0;
    }

    /**
     * @param  numero valor que se a�ade al final
     * de la lista. No se hace nada si la lista est� completa
     * @devolvern true si se ha podido a�adir, false en otro caso
     */
    public boolean addElemento(int numero)
    {
    	if(pos == lista.length)
        	return false;
        lista[pos] = numero;
        pos++;
        return true;
    }

    /**
     * devuelve true si la lista est� completa, false en otro caso
     * Hazlo sin if
     */
    public boolean estaCompleta()
    {
        return pos == lista.length;

    }

    /**
     * devuelve true si la lista est� vac�a, false en otro caso
     * Hazlo sin if
     */
    public boolean estaVacia()
    {
        return pos == 0;

    }

    /**
     * @devolvern  devuelve el n� de elementos
     * realmente guardados en la lista 
     */
    public int getTotalNumeros()
    {
        return pos; 

    }

    /**
     * Representaci�n textual de la lista de la forma
     * Si lista = {175, 826, 89, 9, 41, 13, 72, 11, 23, 107} devuelve
     * |  175 | 826 | 89 | 9 | 41 | 13 | 72 | 11 | 23 |  107 |
     * 
     * Si la lista est� vac�a devuelve ""
     */
    public String toString()
    {
    	String devolver = "";
       	for (int i = 0; i < pos; i++){
       		devolver += "| " + lista[i] + " ";
       	}
        return devolver += "|";
        
    }

    /**
     *  Vac�a la lista
     */
    public void vaciarLista()
    {
        this.pos = 0;
    }

    /**
     *  
     * @devolvern   el segundo m�nimo de la lista
     * Asumimos que la lista tiene al menos un elemento
     * 
     * 
     * Si lista = {12,  12,  12,  4,  4,  55, 789} el 2� m�nimo es 12
     * Si lista = {4, 4, 3, 3, 3, 7, 7, 8} el 2� m�nimo es 4
     * Si lista = {4, 4} el 2� m�nimo es 4
     * Si lista = {4, 3, 2, -7, -5} el 2� m�nimo es -5
     */
    public int segundoMinimo()
    {     	
       	int[] arrayOrdenado = ordenar();
       	int devuelve = arrayOrdenado[0];
       	for (int i = 0; i < arrayOrdenado.length; i++) {
       		if(arrayOrdenado[i] > devuelve){
       			return arrayOrdenado[i];
       		}
       	}
       	return devuelve;
    }

    /**
     *  Borra todos los segundos m�nimos de la lista y devuelve el total de
     *    borrados. Sin utilizar arrays adicionales
     *  
     */
    public int borrarSegundosMinimos()
    {

    	int segundoMinimoNumero = segundoMinimo();
    	int count = 0;
       	for (int i = pos - 1; i >= 0; i--){
       		if(segundoMinimoNumero == lista[i]){

       			for (int j=i; j<pos-1; j++){
       				lista[j] = lista[j+1];

       			}
       			pos--;
       			count++;
       		}
       	}
       	return count;

    }

    /**
     *  Calcula y devuelve un nuevo objeto ListaNumeros  
     *  Este objeto contiene tambi�n un array con tantos elementos como hay en el array lista
     *  pero en cada posici�n queda el d�gito mayor de cada uno de 
     *  los elementos de lista
     *  
     *  Si lista contiene {175, 826, 89, 9, 41, 13, 72, 11, 23, 107}  devuelve
     *  {7, 8, 9, 9, 4, 3, 7, 1, 3, 7}
     *  
     *  Hay que utilizar el m�todo recursivo digitoMasGrande()
     */
    public  ListaNumeros digitosMasGrandes()
    {
        
        ListaNumeros devuelve = new ListaNumeros(pos);
        for (int i = 0; i < pos; i++) {
       		devuelve.lista[i] = digitoMasGrande(lista[i]);
       	}

       	return devuelve;
        
    }

    /**
     *  M�todo est�tico recursivo que devuelve el d�gito mayor de n (siempre se
     *  devuelve d�gito positivo)
     *  Si n = 3263 devuelve 6, si n = 9878 devuelve 9, si n = 5 devuelve 5
     *  Si n = -3263 devuelve 6
     */
   	private static int digitoMasGrande(int n)
    {
        n = Math.abs(n); // para que la cifra devuelta siempre sea positiva
        
        if(n/10 == 0)
        	return n;
        else if(n%10 > digitoMasGrande(n/10))
        	return n%10;
        else
        	return digitoMasGrande(n/10);
    }


    /**
     *  Devuelve una copia del array lista ordenada
     *  Usa solo m�todos de la clase  Arrays
     *   
     *
     */
    public int[] ordenar()
    {
       int[] devuelve = Arrays.copyOf(lista, pos);
       Arrays.sort(devuelve);
       return devuelve;
    }

    /**
     * Mostrar en pantalla la lista
     */
    public void escribirLista()
    {
        System.out.println(this.toString());
    }

    public static void main (String[] args){
    	ListaNumeros demo = new ListaNumeros(5);
    	demo.addElemento(12);
    	demo.addElemento(25);
    	demo.addElemento(5);
    	demo.addElemento(7);
    	demo.addElemento(8);
    	System.out.println(demo.segundoMinimo());
    	demo.digitosMasGrandes().escribirLista();
    	//demo.escribirLista();
    }

}
