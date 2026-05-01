package EjBucles1;

import java.util.Scanner;
import static EjerciciosUno.MetodosEjercicios.*;

public class EjercicioFor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Ejercicios For
            /*
             * 1) Imprimir los números del 1 al 100 usando un `for`.
             * for (int i = 0; i <= 100; i++) {
             * System.out.println("Número actual:" + i);
             * } // FIN :D
             */
            /*
             * 2)Pedirle al usuario un número N e imprimir su tabla de multiplicar (del 1 al
             * 10).
             */

            System.out.println("Escriba un número cualquiera y se mostrará su tabla del 1 al 10");
            String entrada = scanner.nextLine();
            if (!numeroComprobar(entrada)) {
                System.out.println("error con la entrada. Escriba un numero valido");
                return;
            }
            float num = Float.parseFloat(entrada);
            System.out.println("Tabla del 1 al 10 de " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + (num < 0 ? "(" + num + ")" : num) + " = "
                        + ((num < 0 ? "(" + i * num + ")" : i * num)));
            }
        }
    }
}
