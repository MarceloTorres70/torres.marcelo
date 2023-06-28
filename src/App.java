import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import mtUtilitario.mtColores;
import mtUtilitario.mtUtility;
public class App {
    public static void main(String[] args) throws Exception {
        final String mtCEDULA = "1727332247";
        final String mtNOMBRE = "marcelo torres";
        final String mtCORREO = "MARCELO.TORRES@EPN.EDU.EC";
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
                        System.out.println("Hora\t(l) Lunes\t(m) Martes\t(x) Miercoles\t(j) Jueves\t(v) Viernes\t(s) Sabado\t");
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
    /**
    * Imprime la lista de archivos de la carpeta "Horarios".
    * Utiliza colores en la consola para resaltar la presentación.
    */
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
    /**
    * Obtiene los nombres de los archivos en la carpeta especificada.
    *
    * @param mtRutaCarpeta Ruta de la carpeta de la cual se obtendrán los nombres de archivo.
    * @return Conjunto HashSet que contiene los nombres de los archivos encontrados.
    */
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
    /**
    * Muestra el menú de opciones de carga horaria para alumnos.
    * Recibe el nombre de usuario como parámetro.
    *
    * @param mtUsuario Nombre de usuario del alumno.
    * @return Opción seleccionada por el usuario.
    */
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
    /**
    * Realiza el inicio de sesión para un usuario estudiante o profesor.
    * Solicita el nombre de usuario y la clave.
    *
    * @param mtUsuarioEstudiante Nombre de usuario del estudiante.
    * @param mtClaveEstudiante   Clave del estudiante.
    * @return true si el inicio de sesión es exitoso, false de lo contrario.
    */
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
