package EjercicioTres;

import static EjerciciosUno.MetodosEjercicios.*;
import java.time.LocalDate;
import java.util.Scanner;

public class OpcionesDoWhile {
    public static void main(String[] args) {
        /*
         * 3)Usar un `do-while` para crear un menú de opciones:
         * ```
         * 1. Saludar
         * 2. Mostrar la fecha
         * 3. Salir
         * ```
         * El menú se repite hasta que el usuario elija `3`.
         */
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("\nAntes que nada, escriba su nombre: ");
            String nombre = in.nextLine();
            System.out.println("Buenas, " + nombre + ". Bienvenido al menu del ejercicio");
            int op = 0;
            do {
                System.out.println("elija sus opciones :D\n1)Saludar\n2)Mostrar fecha actual\n3)Salir");
                String entrada = in.nextLine();
                if (!numeroComprobar(entrada)) {
                    System.out.println("Error de entrada, escriba una de las 3 opciones (numeros 1, 2 o 3)");
                    continue;
                }
                op = Integer.parseInt(entrada);
                switch (op) {
                    case 1:
                        System.out.println("Buenas " + nombre + " que pases un lindo día, tarde o noche :D\n");
                        break;
                    case 2:
                        LocalDate fechaActual = LocalDate.now();
                        System.out.println("Fecha actual: " + fechaActual + "\n");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opcion no valida. eliga una de las 3 opciones");
                        break;
                }

            } while (op != 3);
            System.out.println("Muchas gracias " + nombre + " por participar :D");
        }
    }
}
