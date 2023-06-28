package mtUtilitario;
import java.util.Scanner;
public class mtUtility {

    public static int mtLeerNumero(int mtNumero) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingresa un número entero entre 0 y 4: ");
                mtNumero = Integer.parseInt(sc.nextLine());

                if (mtNumero >= 0 && mtNumero <= 4) {
                    break;
                } else {
                    System.out.println("El número debe estar entre 0 y 4. Intenta nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debes ingresar un número entero. Intenta nuevamente.");
            }
        }

        return mtNumero;
    }

    public final static void clearConsole() {
        try {
            String operatingSystem = System.getProperty("os.name");

            if (operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}
