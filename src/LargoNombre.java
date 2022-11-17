import java.util.Scanner;

public class LargoNombre {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre");
        String nombre1 = s.nextLine();

        System.out.println("Ingrese el segundo nombre");
        String nombre2 = s.nextLine();

        System.out.println("Ingrese el tercer nombre");
        String nombre3 = s.nextLine();

        String masLargo = ( nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length() ) ? nombre1 :
                nombre2.length() > nombre3.length() ? nombre2 : nombre3;
        System.out.println("El nombre más largo de los 3 es: " + masLargo);
    }
}
