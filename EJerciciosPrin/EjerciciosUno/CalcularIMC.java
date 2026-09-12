package EjerciciosUno;
import static EjerciciosUno.MetodosEjercicios.*;

import java.util.Scanner;


public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Calculadora de IMC. Pedir peso (kg) y altura (m). Calcular IMC = peso /
         * (altura * altura).
         * Clasificar:
         * "Bajo peso" (<18.5),
         * "Normal" (18.5–24.9),
         * "Sobrepeso" (25–29.9),
         * "Obesidad" (≥30).
         * Mostrar el IMC con dos decimales usando String.format("%.2f", imc)
         */
        System.out.println(
                "\nA continuación ingrese su altura(m) y peso(kg) para calcular su IMC. Ingrese solo los números. ");
        System.out.println("escriba su altura en metros (ej: 1.70)");
        String altura = scanner.nextLine().trim().toLowerCase();
        System.out.println("Escribame su peso en kg (ej:75)");
        String peso = scanner.nextLine().trim().toLowerCase();

        if (!numeroComprobar(peso) || !numeroComprobar(altura)) {
            System.out.println("Uno de los datos estan mal escritos");
        } else {
            float pesoDef = Float.parseFloat(peso);
            float alturaDef = Float.parseFloat(altura);
            float imc = pesoDef / (alturaDef * alturaDef);
            System.out.printf("Tu IMC es: %.2f\n", imc);
            if (imc < 18.5)
                System.out.println("Bajo peso");
            if (imc >= 18.5 && imc <= 24.9)
                System.out.println("Normal");
            if (imc > 25.0 && imc <= 29.9)
                System.out.println("Sobrepeso");
            if (imc > 30.0)
                System.out.println("Obesidad");
        }
        scanner.close();
    }
}