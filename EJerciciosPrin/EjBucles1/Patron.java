package EjBucles1;

import java.util.Scanner;

public class Patron {
    /*
     * Imprimir el siguiente patrón usando loops anidados (el usuario ingresa el
     * tamaño N, ej: N=5):
     */
    /* 
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("igresa un numero");
            int patron = in.nextInt();
            if (patron < 0)
                System.out.println("Numero no valido");


            for (int i = 1; i <= patron; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = patron - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

    }
}
