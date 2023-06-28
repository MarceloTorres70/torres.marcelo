package mtUtilitario;
import java.util.Scanner;
public class mtUtility {
    /**
    * Lee un número entero ingresado por el usuario y asegura que esté en el rango de 0 a 4 (inclusive).
    *
    * @param mtNumero El número entero a ser leído.
    * @return El número entero válido ingresado por el usuario.
    */
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
    /**
    * Limpia la consola del sistema operativo actual.
    * La implementación varía según el sistema operativo.
    * Esta función es final y no puede ser sobrescrita.
    */
    public final static void mtLimpiararConsola() {
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
