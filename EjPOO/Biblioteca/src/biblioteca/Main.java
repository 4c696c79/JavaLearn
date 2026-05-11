package biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Material> biblioteca = new ArrayList<>();
        //variables Conteo
        int cantL = 0, cantR = 0, cantP = 0;
        biblioteca.add(new Libro("Carlos Juan Pablo Goku", "El Principe Zuko", 1998));
        biblioteca.add(new Podcast(30, "Sobre las empanadas", 2003));
        biblioteca.add(new Revista(32, "Gatos Gatosos", 1999));
        biblioteca.add(new Revista(2, "Carlos el carloso", 2019));
        biblioteca.add(new Libro("Lily", "Mi libro", 2025));

        System.out.println("----------------------------------");
        for (Material m : biblioteca) {
            m.mostrarInfo();
            System.out.println("----------------------------------");
            if (m instanceof Libro) cantL++;
            if (m instanceof Revista) cantR++;
            if (m instanceof Podcast) cantP++;
        }
        System.out.println("Hubo:");
        System.out.println(cantL+" Libros");        
        System.out.println(cantR+" Revistas");
        System.out.println(cantP+" Podcast");


    }
}
