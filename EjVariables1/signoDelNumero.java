package EjerciciosUno;

import static EjerciciosUno.MetodosEjercicios.*;

import java.util.Scanner;

public class signoDelNumero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Ejercicio: Escribir un número y decirle si es positivo, negativo o cero.*/
        while (true) {
            System.out.println(
                "\nEscriba un número para saber si es positivo, negativo o es cero.\nSi quieres salir del programa escriba 'Salir'");
            String entrada = in.nextLine().trim().toLowerCase();
            if (entrada.equals("salir")) {
                System.out.println("Gracias por usar el programa OvO <3");
                break;
            }
            //Aqui llamamos a un metodo (dentro de la clase MetodosEjercicios) para comprobar si elusuario escribio un numero, si da false saldrá error
            if (!numeroComprobar(entrada)) {
                System.out.println("Error, Escriba un número valido\n");
            } else {
                //en caso contrario, se almacena en un double
                double numero = Double.parseDouble(entrada);
                if (numero < 0) {
                    System.out.println("Tu número es menor que cero (negativo)");
                } else if (numero > 0) {
                    System.out.println("Tu número es mayor que cero (positivo)");
                } else {
                    System.out.println("Tu número es cero (neutro)");
                }

            }

        }
        in.close();
    }
}
