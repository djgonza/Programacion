
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
        testAñadirContactos();
    }

    /**
     *  
     */
    public void testAñadirContactos()
    {
        agenda.añadirContacto(new ContactoPersonal("Blanca López","948123456",new Fecha(26, 3, 1970)));
        agenda.añadirContacto(new ContactoProfesional("Beltrán Iriarte","948456677","Empresa 01 D.A."));
        agenda.añadirContacto(new ContactoPersonal("Pepa Rus","675435672",new Fecha(15, 4, 1970)));
        agenda.añadirContacto(new ContactoPersonal("Pablo Burgui","678897543",new Fecha(12, 7, 1980)));
        agenda.añadirContacto(new ContactoProfesional("David Alsúa","948223344","Empresa 02 S.L."));
        agenda.añadirContacto(new ContactoPersonal("Blanca López","948123456",new Fecha(26, 3, 1970)));
        agenda.añadirContacto(new ContactoProfesional("Beltrán Iriarte","948456677","Empresa 01 D.A."));
        agenda.añadirContacto(new ContactoProfesional("Berta Ruiz","616789654","Empresa 04 S.A."));
        agenda.añadirContacto(new ContactoPersonal("Juan García","948112333",new Fecha(26, 3, 1989)));
        agenda.añadirContacto(new ContactoPersonal("Marisa Esteban","689123456",new Fecha(5, 11, 1981)));
        agenda.añadirContacto(new ContactoPersonal("Isabel Ortiz","948131313",new Fecha(31 ,12, 1990)));
        agenda.añadirContacto(new ContactoProfesional("Juan García","948888888", "Empresa XXX"));
        agenda.añadirContacto(new ContactoProfesional("Juan García","655432126", "Empresa JJJ"));
        agenda.añadirContacto(new ContactoPersonal("Belinda Bosch","675231987",new Fecha(1, 1, 1980)));
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
        List<Contacto> buscados = agenda.buscarContacto("Juan garcía");
        System.out.println(buscados.toString());
    }

    /**
     *  
     */
    public void demoBuscarContacto()
    {
        Contacto c = new ContactoPersonal("Marisa Esteban","689123456",new Fecha(5, 11, 1981));
        System.out.println("El contacto " + c.toString() + " está en la agenda " + agenda.buscarContacto(c));
        c = new ContactoProfesional("Beltrán Iriarte","948456677","Empresa 01 D.A.");
        System.out.println("El contacto " + c.toString() + " está en la agenda " + agenda.buscarContacto(c));
        c = new ContactoPersonal("Julio Bueno","689123456",new Fecha(5, 11, 1981));
        System.out.println("El contacto " + c.toString() + " está en la agenda " + agenda.buscarContacto(c));
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
        demo.testAñadirContactos();
        demo.demoBuscarContacto("Juan garcía");
        demo.demoBuscarContacto();
        demo.demoTotalContactos();
        demo.demoTotalContactosPersonales('P');
        demo.demoFelicitar();
        demo.demoProfesionalesOrdenadosPorNombre('b');
        demo.demoPersonalesOrdenadosPorFecha('m');
    }


}
