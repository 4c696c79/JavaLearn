package EjerciciosUno;

import java.util.Scanner;

public class notaEstudiante {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        /*
         * Pedirle al usuario su nota (0-100). Mostrar: "Sobresaliente" (90-100),
         * "Muy bueno" (80-89), "Bueno" (70-79), "Aprobado" (60-69), "Reprobado" (0-59).
         */
        System.out.println("\nEscriba su nota para comprobar su rendimiento academico");
        String nota = entrada.nextLine().trim().toLowerCase();
        if (!MetodosEjercicios.numeroComprobar(nota)) {
            System.out.println("Error: Escriba un número valido");
        } else {
            int num = Integer.parseInt(nota);
            if (num >= 101 || num <= -1) {
                System.out.println("Ingrese una cantidad de nota valida");
            } else {
                if (num <= 59) System.out.println("Reprobado, esfuércese más para la proxima"); 
                if (num >= 80 && num <= 89) System.out.println("Muy bueno"); 
                if (num >= 70 && num <= 79) System.out.println("Bueno"); 
                if (num >= 60 && num <= 69) System.out.println("Aprobado"); 
                if (num >= 90 && num <= 100) System.out.println("Sobresaliente, felicidades por la nota"); 
            }
        }
        entrada.close();
    }
}
