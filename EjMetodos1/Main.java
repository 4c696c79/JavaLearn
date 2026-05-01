package EjMetodos1;

import java.util.Scanner;
import static EjMetodos1.MetodosJava.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner en = new Scanner(System.in)) {

            // Verificar si el año es biciesto
            System.out.println("Escriba un año y se vera si es biciesto o no");
            int anio = en.nextInt();
            System.out.println("El año " + anio + " es bisiesto? "
                    + (esBisiesto(anio) == true ? "Si es biciesto" : "No es biciesto"));

            // Sacar el factorial de n
            System.out.println("Escriba un numero y vera su factorial");
            int num = en.nextInt();
            System.out.println((num < 0 ? "El numero no se puede factorizar "
                    : "El factorial de " + num + "! es :" + esFactorial(num)));

            // Mostrar el rango del 1 al 10 y ver si son numeros primos
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " = " + esPrimo(i));
            }
            en.nextLine();

            // Verificar si una palabra, frase u oracion es palindoma (que se lea del
            // derecho al reves)
            System.out.println("Hallar la palabra o frase si es palindroma (escriba una palabra o frase):");
            String texto = en.nextLine();
            System.out.println(texto + " ¿es palindroma? = " + (esPalindromo(texto) == true ? "Si" : "No"));
        }
    }
}
