package EjMetodos1;

public class MetodosJava {
    /*
     * Metodo 1:
     * Crear un método esBisiesto(int anio) que retorne true si el año es bisiesto.
     * Un año es bisiesto si es divisible por 4, excepto los divisibles por 100,
     * salvo que también sean divisibles por 400.
     */
    public static boolean esBisiesto(int anno) {
        return ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0);
    }

    public static boolean esBisiesto(long anno) {
        return ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0);
    }

    // Crear un método factorial(int n) que retorne el factorial de n (usando un
    // loop). Probarlo con varios valores desde main.
    public static int esFactorial(int n) {
        if (n < 0 && n % 1 != 0)
            return -1;
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }

    public static long esFactorial(long n) {
        if (n < 0 && n % 1 != 0)
            return -1;
        for (long i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }

    // Crear un método esPrimo(int n) que retorne true si el número es primo. Luego
    // en main, usar un loop para imprimir todos los primos entre 1 y 100 usando ese
    // método.
    public static boolean esPrimo(int num) {
        boolean pri = true;
        if (num < 2)
            return false;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                pri = false;
                break;
            }
        }
        return pri;
    }

    // Crear el método esPalindromo(String texto) que retorne true si el texto es un
    // palíndromo (se lee igual al derecho que al revés), ignorando mayúsculas y
    // espacios. Ej: "Anita lava la tina" → true. Ayuda: podés usar .replace(" ",
    // "") y .toLowerCase(), y luego recorrer con un loop o usar StringBuilder.
    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");
        String textoReves = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoReves += texto.charAt(i);
        }
        return textoReves.equals(texto);
        /*
         * Esta tambien es otra forma de hacer lo mismo con StringBuilder
         * StringBuilder textoReves = new StringBuilder();
         * // dentro del loop:
         * textoReves.append(texto.charAt(i));
         * // al final comparar:
         * return textoReves.toString().equals(texto);
         */
    }
}
