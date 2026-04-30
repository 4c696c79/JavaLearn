package EjercicioTres;

import java.util.Scanner;

public class SumaProMax {

    /*
     * Pedirle al usuario números continuamente (con `while`)
     * hasta que ingrese `0`. Al final, mostrar la suma, el promedio,
     * el máximo y el mínimo de los números ingresados (sin contar el cero).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nEliga un numero cualquiera, a exepcion del cero, y se hallara:\n" +
                    "La suma total de todos los números que puso\n" +
                    "El promedio de todos los número\n" +
                    "El maximo y minimo de los números ingresados\n");
            // Variables de iniciación
            double num = 0;
            double suma = 0;
            int cont = 0;
            double max = num;
            double min = num;
            while (true) {
                System.out.print("Escriba un número (0 para salir):");
                num = scanner.nextDouble();
                if (num == 0)
                    break;
                suma += num;
                cont++;
                // Comprueba que si el usuario ingresó un número, si es asi, declara que el max
                // y min son ese numero despues compara con el siguente.
                if (cont == 1) {
                    max = num;
                    min = num;
                } else {
                    if (num > max)
                        max = num;
                    if (num < min)
                        min = num; // Comprobar si el nuevo número es menor
                }

            }
            if (cont < 1){
                System.out.println("\nNo se ingreso números");
            }else{
                System.out.println("\nOk, después de los datos recopilados, esto es lo llegado:" +
                    "\nCantidad de números ingresados " + cont +
                    "\nLa suma de todos los numeros ingresado son: " + suma +
                    "\nEl promedio aproximado es: " + (suma != 0 && cont != 0 ? suma / cont : 0) +
                    "\nEl número máximo más grande es :" + max +
                    "\nEl número mas pequeño o minimo de los ingresados es: " + min);
            }
            
        }
    }
}
