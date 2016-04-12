
import java.util.List;

/**
 * Demo de la agenda
 */
public class DemoAgendaContactos
{
    private AgendaContactos agenda;
    /**
     * Constructor de objetos de la clase DemoAgendaContactos
     */
    public DemoAgendaContactos()
    {
        agenda = new AgendaContactos();
        testA�adirContactos();
    }

    /**
     *  
     */
    public void testA�adirContactos()
    {
        agenda.a�adirContacto(new ContactoPersonal("Blanca L�pez","948123456",new Fecha(26, 3, 1970)));
        agenda.a�adirContacto(new ContactoProfesional("Beltr�n Iriarte","948456677","Empresa 01 D.A."));
        agenda.a�adirContacto(new ContactoPersonal("Pepa Rus","675435672",new Fecha(15, 4, 1970)));
        agenda.a�adirContacto(new ContactoPersonal("Pablo Burgui","678897543",new Fecha(12, 7, 1980)));
        agenda.a�adirContacto(new ContactoProfesional("David Als�a","948223344","Empresa 02 S.L."));
        agenda.a�adirContacto(new ContactoPersonal("Blanca L�pez","948123456",new Fecha(26, 3, 1970)));
        agenda.a�adirContacto(new ContactoProfesional("Beltr�n Iriarte","948456677","Empresa 01 D.A."));
        agenda.a�adirContacto(new ContactoProfesional("Berta Ruiz","616789654","Empresa 04 S.A."));
        agenda.a�adirContacto(new ContactoPersonal("Juan Garc�a","948112333",new Fecha(26, 3, 1989)));
        agenda.a�adirContacto(new ContactoPersonal("Marisa Esteban","689123456",new Fecha(5, 11, 1981)));
        agenda.a�adirContacto(new ContactoPersonal("Isabel Ortiz","948131313",new Fecha(31 ,12, 1990)));
        agenda.a�adirContacto(new ContactoProfesional("Juan Garc�a","948888888", "Empresa XXX"));
        agenda.a�adirContacto(new ContactoProfesional("Juan Garc�a","655432126", "Empresa JJJ"));
        agenda.a�adirContacto(new ContactoPersonal("Belinda Bosch","675231987",new Fecha(1, 1, 1980)));
        System.out.println(agenda.toString());
    }

    /**
     *  Mostrar la agenda
     *
     * 
     */
    public void mostrar()
    {
        agenda.mostrar();
    }

    /**
     *  
     */
    public void demoBuscarContacto(String nombre)
    {
        List<Contacto> buscados = agenda.buscarContacto("Juan garc�a");
        System.out.println(buscados.toString());
    }

    /**
     *  
     */
    public void demoBuscarContacto()
    {
        Contacto c = new ContactoPersonal("Marisa Esteban","689123456",new Fecha(5, 11, 1981));
        System.out.println("El contacto " + c.toString() + " est� en la agenda " + agenda.buscarContacto(c));
        c = new ContactoProfesional("Beltr�n Iriarte","948456677","Empresa 01 D.A.");
        System.out.println("El contacto " + c.toString() + " est� en la agenda " + agenda.buscarContacto(c));
        c = new ContactoPersonal("Julio Bueno","689123456",new Fecha(5, 11, 1981));
        System.out.println("El contacto " + c.toString() + " est� en la agenda " + agenda.buscarContacto(c));
    }

    /**
     *  
     */
    public void demoFelicitar()
    {
        System.out.println("Hoy hay que felicitar a ...");
        List<ContactoPersonal> cumples = agenda.felicitar();
        System.out.println(cumples.toString());
    }

    /**
     *  
     */
    public void demoTotalContactos()
    {
        System.out.println("En la agenda hay " + agenda.totalContactos());

    }

    /**
     *  
     */
    public void demoTotalContactosPersonales(char letra)
    {
        List<ContactoPersonal> personales = agenda.personalesEnLetra(letra);
        System.out.println("Contactos personales en la letra " + letra + "\n" +
            personales.toString());
        System.out.println("Total personales en la letra " + letra + personales.size());
    }

    /**
     *  
     */
    public void demoProfesionalesOrdenadosPorNombre(char letra)
    {
        System.out.println("\nProfesionales ordenados por nombre");
        Contacto[] profesionales = agenda.profesionalesOrdenadosPorNombre(letra);
        for (Contacto c: profesionales)
        {
            System.out.println(c.toString());
        }

    }

    /**
     *  
     */
    public void demoPersonalesOrdenadosPorFecha(char letra)
    {
        System.out.println("Personales ordenados por fecha");
        Contacto[] personales = agenda.personalesOrdenadosPorFecha(letra);
        for (Contacto c: personales)
        {
            System.out.println(c.toString());
        }

    }
    
    /**
     *  
     *
     */
    public static void main(String[] args)
    {
        DemoAgendaContactos demo = new DemoAgendaContactos();
        demo.testA�adirContactos();
        demo.demoBuscarContacto("Juan garc�a");
        demo.demoBuscarContacto();
        demo.demoTotalContactos();
        demo.demoTotalContactosPersonales('P');
        demo.demoFelicitar();
        demo.demoProfesionalesOrdenadosPorNombre('b');
        demo.demoPersonalesOrdenadosPorFecha('m');
    }


}
