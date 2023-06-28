import java.util.Scanner;

import javax.swing.text.MutableAttributeSet;

import mtUtilitario.mtUtility;
public class App {
    public static void main(String[] args) throws Exception {
        String mtCEDULA = "1727332247";
        String mtNOMBRE = "marcelo torres";
        String mtCORREO = "MARCELO.TORRES@EPN.EDU.EC";
        String mtUsuarioLogueado = "PROFE";
        mtLogIn(mtCORREO, mtCEDULA);
        

    }
    
    public static boolean mtLogIn(String mtUsuarioEstudiante, String mtClaveEstudiante){
        String mtUsuario;
        String mtClave;
        int mtIntentosRealizados = 0;
        int mtIntentosRestantes = 3;
        Scanner scanner = new Scanner(System.in);
        while (mtIntentosRealizados < 3) {
            System.out.println("_________________");
            System.out.print("mtUsuario: ");
            mtUsuario = scanner.nextLine();
            System.out.print("mtClave: ");
            mtClave = scanner.nextLine();
            System.out.println("_________________");

            if ((mtUsuario.equals(mtUsuarioEstudiante) && mtClave.equals(mtClaveEstudiante)) ||
                (mtUsuario.equals("profe") && mtClave.equals("1234"))) {
                System.out.println("Bienvenido " + mtUsuario.toUpperCase());
                return true;
            } else {
                mtIntentosRealizados++;
                mtIntentosRestantes--;
                System.out.println("Lo sentimos, tu mtUsuario y mtClave son incorrectos..!");
                System.out.println("Nro de intentos restantes: " + mtIntentosRestantes);
                if (mtIntentosRestantes == 0) {
                    System.out.println("Lo sentimos, tu usuario y/o clave son incorrectos..!");
                    System.out.println("Gracias");
                    return false;
                }
            }
        }
        return false;
    }
}
