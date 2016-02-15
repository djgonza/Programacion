
/**
 * 
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class AppColeccionEnteros
{

    public static void main(String[] args)
    {
        ColeccionEnteros colecc = new ColeccionEnteros();
        JOptionPane.showMessageDialog(null, colecc.toString());
        ArrayList<Integer> ordenada = colecc.ordenar();
        JOptionPane.showMessageDialog(null, "Lista ordenada: \t " + ordenada.toString());

        ArrayList<Integer> otra =  new ArrayList<>();
        otra.addAll(Arrays.asList(5, 8, 8, 10, 12, 18));
        colecc.elementosComunes(otra);
        JOptionPane.showMessageDialog(null, "Elementos comunes \t " + colecc.toString());

        colecc.elementosDiferentes(otra);
        JOptionPane.showMessageDialog(null, "Elementos diferentes \t " + colecc.toString());
    }

}
