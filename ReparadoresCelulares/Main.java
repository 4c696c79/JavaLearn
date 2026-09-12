package EjPOO.ReparadoresCelulares;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //ArrayList<Cliente> cli = new ArrayList<>();
        //ArrayList<Tecnico> tec = new ArrayList<>();
        //Esos dos ArrayList pueden hacerse por separado, pero podemos usar polimorfismo que podes usar la clase padre y poder almacenar cada usuario de forma separada :D
        ArrayList<Usuario> user = new ArrayList<>();
        //Añadir tecnicos
        user.add(new Tecnico("Juan", "juanjuanito@gmail.com", "31231221fds", "Reparador"));
        user.add(new Tecnico("Pedro", "PedroPoderoso@hotmail.com", "Pepe", "Marketing"));
        user.add(new Tecnico("Pedro", "PedroPoderoso@hotmail.com", "Pepe", "Marketing"));

        //Añadir clientes
        user.add(new Cliente("Laura", "LauraMate@yahoo.com.uy", "Laura", 99986457));
        user.add(new Cliente("el panadero", "bullll@gmail.com", "null", 983423422));

        for (Usuario p : user) {
            p.mostrarRol();
        }
        
        System.out.println("\nLa cantidad de usuarios en total son de "+user.size());





    }
}