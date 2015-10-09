
/**
 *  class Fecha  
 * 
 * @author  
 * @version  
 */
public class Fecha
{

    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor de la clase Fecha
     */
    public Fecha(int dia,int mes,int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     *  devuleve true si es bisiesto
     */
    public boolean esBisiesto()
    {
        return this.anio % 4 == 0 && this.anio % 100 != 0 || this.anio % 400 == 0;
    }

    /**
     *  devulve dias del mes
     */
    public int diasMes()
    {
        int dias;
        switch (mes) 
        {
            case 2: 
            if (esBisiesto())
                dias = 29;
            else
                dias = 28;
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
            dias = 31;
            break;
            default: 
            dias = 30;
            break;
        }

        return dias;
    }

    /**
     *  muestra fecha corta
     */
    public void printCorta()
    {
        System.out.println (this.dia + "-" + this.mes + "-" + this.anio);
    }

    /**
     *  muestra fecha larga /3 de Noviembre de 2005/
     */
    public String printLarga()
    {
        String fecha = "" + this.dia;

        //formatea meses
        switch (this.mes)
        {
            case 1: fecha += " de Enero";
            break;
            case 2: fecha += " de Febrero";
            break;
            case 3: fecha += " de Marzo";
            break;
            case 4: fecha += " de Abril";
            break;
            case 5: fecha += " de Mayo";
            break;
            case 6: fecha += " de Junio";
            break;
            case 7: fecha += " de Julio";
            break;
            case 8: fecha += " de Agosto";
            break;
            case 9: fecha += " de Septiembre";
            break;
            case 10: fecha += " de Octubre";
            break;
            case 11: fecha += " de Noviembre";
            break;
            default: fecha += " de Diciembre";
            break;
        }

        //formatea años
        fecha += " de " + this.anio;

        return fecha;

    }

    /**
     *  validacion fecha
     *  
     */
    public boolean esCorrecta()
    {
        if(this.dia >= 1 && this.dia <= diasMes())
            if(this.mes >= 1 && this.mes <= 12)
                return true;
        return false;
    }

    /**
     *  comprueva fecha anterior
     */
    public boolean precedeA(int dia, int mes, int anio)
    {
        if(this.anio > anio || this.anio == anio && this.mes > mes || this.anio == anio && this.mes == mes && this.dia > dia)
            return true;
        return false;
    }

    /**
     *  avanza un dia
     */
    public void avanzarDia()
    {
        if(this.dia == diasMes()){
            this.dia = 1;
            if(this.mes == 12) {
                this.mes = 1;
                this.anio++;
            }else{
                this.mes++;
            }
        }else{
            this.dia++;
        }
    }

}
