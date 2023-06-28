import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import mtUtilitario.mtColores;
import mtUtilitario.mtUtility;
public class App {
    public static void main(String[] args) throws Exception {
        String mtCEDULA = "1727332247";
        String mtNOMBRE = "marcelo torres";
        String mtCORREO = "MARCELO.TORRES@EPN.EDU.EC";
        String mtUsuarioLogueado = "PROFE";
        mtUtility.mtLimpiararConsola();
        if (mtLogIn(mtCORREO, mtCEDULA) == true) {
            do {
                switch (mtPresentarMenu(mtUsuarioLogueado)) {
                    case 1:
                        mtPresentarAlumnos();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 0:
                        System.out.println("Regresa pronto " + mtUsuarioLogueado);
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } while (mtPresentarMenu(mtUsuarioLogueado) != 0);
        }

    }
    public static void mtPresentarAlumnos() {
        String mtRutaCarpeta = "Horarios";
        System.out.println(mtColores.BOLD_PURPLE + "-----------------");
        System.out.println(mtColores.BOLD_PURPLE + " Lista de ALUMNOS");
        System.out.println(mtColores.BOLD_PURPLE + "-----------------");
        HashSet<String> mtListaArchivos = mtObtenerNombresArchivos(mtRutaCarpeta);

        for (String mtNombreArchivo : mtListaArchivos) {
            System.out.println(mtColores.RED + mtNombreArchivo);
        }
    }
    public static HashSet<String> mtObtenerNombresArchivos(String mtRutaCarpeta) {
        HashSet<String> mtListaArchivos = new HashSet<>();

        File mtCarpeta = new File(mtRutaCarpeta);
        if (mtCarpeta.exists() && mtCarpeta.isDirectory()) {
            File[] mtArchivos = mtCarpeta.listFiles();
            if (mtArchivos != null) {
                for (File archivo : mtArchivos) {
                    if (archivo.isFile()) {
                        mtListaArchivos.add(archivo.getName());
                    }
                }
            }
        }
        return mtListaArchivos;
    }
    public static int mtPresentarMenu(String mtUsuario) {
        int mtOpcionElegida = -1;
        System.out.println(mtColores.BOLD_PURPLE + "-----------------");
        System.out.println(mtColores.BOLD_PURPLE + " Carga horaria de ALUMNOS");
        System.out.println(mtColores.BOLD_PURPLE + "-----------------");
        System.out.println(mtColores.BOLD_PURPLE + "Usuario: " + mtUsuario);
        System.out.println();
        System.out.println(mtColores.BOLD_BLUE + "1.- Visualizar Alumnos");
        System.out.println(mtColores.BOLD_BLUE + "2.- Visualizar Asignaturas");
        System.out.println(mtColores.BOLD_BLUE + "3.- Visualizar Horario");
        System.out.println(mtColores.BOLD_BLUE + "4- Visualizar Horario de una asignatura");
        System.out.println(mtColores.BOLD_BLUE + "0.- SALIR");
        mtOpcionElegida = mtUtility.mtLeerNumero(mtOpcionElegida);
        mtUtility.mtLimpiararConsola();
        return mtOpcionElegida;
    }
    public static boolean mtLogIn(String mtUsuarioEstudiante, String mtClaveEstudiante) {
        String mtUsuario;
        String mtClave;
        int mtIntentosRealizados = 0;
        int mtIntentosRestantes = 3;
        Scanner scanner = new Scanner(System.in);
        while (mtIntentosRealizados < 3) {
            System.out.println(mtColores.GREEN + "_________________");
            System.out.print(mtColores.PURPLE + "Usuario: ");
            mtUsuario = scanner.nextLine();
            System.out.print(mtColores.PURPLE + "Clave: ");
            mtClave = scanner.nextLine();
            System.out.println(mtColores.GREEN + "_________________");

            if ((mtUsuario.equals(mtUsuarioEstudiante) && mtClave.equals(mtClaveEstudiante)) ||
                    (mtUsuario.equals("profe") && mtClave.equals("1234"))) {
                System.out.println(mtColores.YELLOW + "Bienvenido " + mtUsuario.toUpperCase());
                return true;
            } else {
                mtIntentosRealizados++;
                mtIntentosRestantes--;
                System.out.println(mtColores.BOLD_RED + "Lo sentimos, tu mtUsuario y mtClave son incorrectos..!");
                System.out.println(mtColores.BRIGHT_RED + "Nro de intentos restantes: " + mtIntentosRestantes);
                if (mtIntentosRestantes == 0) {
                    System.out.println(mtColores.BOLD_RED + "Lo sentimos, tu usuario y/o clave son incorrectos..!");
                    System.out.println(mtColores.BRIGHT_GREEN + "Gracias");
                    return false;
                }
            }
        }
        return false;
    }
}
