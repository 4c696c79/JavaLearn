package EjerciciosUno;

public class MetodosEjercicios {
    //creamos un método booleano por que noostros nos interesa si el usuario ecribio un numero
    public static boolean numeroComprobar(String texto) {
        //Comprobamos primero que no esté vacio
        if (texto == null || texto.isBlank())
            return false;
        try {
            //pasamos el texto (en teoria un número escrito) a un numero decimal
            //despues de eso, devolvemos true
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            //en caso contrario solo devolvemos false
            return false;
        }
    }
}
