
/**
 *   Representa a una cuenta bancaria
 */
public class Cuenta
{

    private double importe;

    /**
     * Constructor  
     */
    public Cuenta(double importe)
    {
        this.importe = importe;
    }

    /**
     * Accesor para el importe
     */
    public  double getImporte()
    {
        return importe;
    }

    /**
     *  Añadir una cantidad
     *  Si la cantidad es <= 0 se lanza y se avisa de la excepción
     *  IllegalArgumentException
     *  
     */
    public void ingresar(double cantidad) throws IllegalArgumentException
    {
        if(cantidad <= 0)
            throw new IllegalArgumentException("Argumento no valido ");
        importe += cantidad;

    }

    /**
     *  Reintegra de la cuenta la cantidad indicada
     *  Si la cantidad es <= 0 se lanza y se avisa de la excepción
     *  IllegalArgumentException
     *  Si se quiera sacar más cantidad de la que hay se lanza
     *  la excepción personalizada SaldoInsuficienteException
     */
    public void sacar(double cantidad)  throws IllegalArgumentException, SaldoInsuficienteException
    {
        if(cantidad <= 0)
            throw new IllegalArgumentException("Argumento no valido");
        if(cantidad > importe)
            throw new SaldoInsuficienteException("Saldo insuficiente");
        importe -= cantidad;

    }

    /**
     * 
     */
    public  String toString()
    {
        return "Saldo en la cuenta: " + importe;
    }

}
