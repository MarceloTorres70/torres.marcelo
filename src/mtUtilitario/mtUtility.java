package mtUtilitario;
import java.util.Scanner;
public class mtUtility {

    public static Scanner sc = new Scanner(System.in);

    public static int getPositiveNumber(String Label) {
        System.out.print(Label);
        int numero;
        do {
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero <= 0)  {
                    System.out.println("Ingrese un numero positivo");
                }
            } catch (NumberFormatException e) {
                System.out.println("  - Ingrese un numero valido");
                numero = -1;
            }
        } while (numero <= 0);   
        return numero;
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
