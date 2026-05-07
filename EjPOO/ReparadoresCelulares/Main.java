package EjPOO.ReparadoresCelulares;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Cliente> cli = new ArrayList<>();
        ArrayList<Tecnico> tec = new ArrayList<>();
        //Añadir tecnicos
        tec.add(new Tecnico("Juan", "juanjuanito@gmail.com", "31231221fds", "Reparador"));
        tec.add(new Tecnico("Pedro", "PedroPoderoso@hotmail.com", "Pepe", "Marketing"));
        tec.add(new Tecnico("Pedro", "PedroPoderoso@hotmail.com", "Pepe", "Marketing"));

        //Añadir clientes
        cli.add(new Cliente("Laura", "LauraMate@yahoo.com.uy", "Laura", 99986457));
        cli.add(new Cliente("el panadero", "bullll@gmail.com", "null", 983423422));

        for (Cliente p : cli) {
            p.mostrarRol();
        }
        for (Tecnico pp : tec) {
            pp.mostrarRol();
        }
        System.out.println("\nLa cantidad de usuarios en total son de "+(cli.size() + tec.size()));





    }
}