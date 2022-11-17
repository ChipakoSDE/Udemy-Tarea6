import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese primer nombre completo");
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese segundo nombre completo");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese tercer nombre completo");

        String[] nom1 = nombre1.split(" ");
        String[] nom2 = nombre2.split(" ");
        String[] nom3 = nombre3.split(" ");

        String masLargo = nom1[0].length() > nom2[0].length() ? nombre1 :
                nom2[0].length() > nom3[0].length() ? nombre2 : nombre3;
        JOptionPane.showMessageDialog(null, masLargo.concat(" tiene el nombre mas largo."));

    }
}
