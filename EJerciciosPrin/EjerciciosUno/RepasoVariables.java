package EjerciciosUno;

import java.util.Scanner;

public class RepasoVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 1");
        /*
         * Declarar variables de distintos tipos (nombre, edad, altura, activo) e
         * imprimirlas en consola con un mensaje descriptivo. Ej:
         * "Nombre: Juan, Edad: 20, Altura: 1.75m, Activo: true".
         */
        String nombre1 = "Juan";
        int edad = 20;
        double altura = 1.75;
        var activo = true;
        // esto no aporta nada, es anotacion nada más jeje
        System.out.println("Nombre:" + nombre1 + " Edad:" + edad + " Altura"
                + altura + " Esta acrivo? " + (activo == true ? "Si" : "No"));

        System.out.println("\nEjercicio 2");
        /*
         * Pedirle al usuario su nombre y su año de nacimiento. Calcular su edad
         * aproximada (usando el año actual, que podés hardcodear como 2026) e imprimir:
         * "Hola [nombre], tenés aproximadamente [edad] años.".
         */

        System.out.println("Buenas, Dime cual es tu nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Ahora averiguare su edad, digame su año de nacimiento: ");
        int año = scanner.nextInt();
        System.out.println("Bueno " + nombre2 + ", tienes " + (2026 - año) + " años");
        // Podes hacer condicionales, operaciones, etc si lo haces entre parentesis ()

        System.out.println("\nEjercicio 3");
        scanner.nextLine();
        /*
         * Pedirle al usuario una oración. Imprimir: la longitud de la oración, la
         * oración en mayúsculas, la oración en minúsculas, y si contiene la palabra
         * "Java".
         */

        System.out.println("Buenas usuario, escriba una oracion");
        String oracion = scanner.nextLine().trim();

        // Contamos las veces que aparece "java" sin importar mayúsculas
        // El " +" en un split es para cuando si hay más de un espacio
        String[] palabras = oracion.toLowerCase().split(" +");
        int cont = 0;
        for (String p : palabras) {
            if (p.contains("java")) cont++;
        }
        System.out.println("Tu oración tiene una longitud de: " + oracion.length() + " caracteres");
        System.out.println("Tu oracion en mayúsculas :'" + oracion.toUpperCase());
        System.out.println("Tu oracion en minusculas :'" + oracion.toLowerCase());
        System.out.println("Tu oracion "+ (oracion.contains("java") ? "si y tiene la palabra 'Java' y aparece al un total de " + cont + " veces": "no contiene la palabra 'Java'"));

        System.out.println("\nEjercicio 4");
        /*
         * Pedirle al usuario su nombre completo (nombre y apellido en una sola línea).
         * Separar el nombre del apellido usando split(" ") e imprimirlos por separado.
         * Luego crear sus iniciales (primera letra de cada uno) usando charAt(0) y
         * mostrarlo como "Iniciales: J.G.".
         */
        while (true) {
            System.out.println("Ahora escribame su nombre y apellido, separado con espacio");
            String[] NCompleto = scanner.nextLine().trim().split(" +");
            if (NCompleto.length == 2) {
                String nombre3 = NCompleto[0];
                String apellido = NCompleto[1];
                System.out
                        .println("OK, entonces tu nombre es: '" + NCompleto[0] + "' y tu apellido es: '" + NCompleto[1]
                                + "'\nTus iniciales son:" + nombre3.charAt(0) + "." + apellido.charAt(0));
                break;
            } else {
                System.out.println("Error, Escriba su nombre y apellido separado con un espacio");
            }
        }

        scanner.close();
    }
}
