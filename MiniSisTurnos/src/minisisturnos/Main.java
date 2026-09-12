package minisisturnos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Bienvenid@ al hospital Java =D");
        //Asignamos el arrayList y aprovechamos el polimorfismo
        ArrayList<Persona> per = new ArrayList<>();
        //Asignamos los objetos. esto tambien podriamos hacer con un Scanner
        //para que sea mas corto pero son caso de prueba.
        per.add(new Medico(123456, "Juan", "Quiropratcto"));
        per.add(new Medico(1234, "Jose", "Curador"));
        per.add(new Paciente(12344, "Pedro", "Trabajador"));
        per.add(new Paciente(12311, "Josefina", "Estudiante"));
        per.add(new Paciente(21312412, "Irene", "Artista"));

        //Asignar turnos
        int cantTurnos;
        for (int i = 0; i < per.size(); i++) {//Esto tambien se podria hacer con 
            //forEach pero me resultó más comodo XD
            if (per.get(i) instanceof Paciente) {
                continue;
            }
            System.out.println("Cuantos turnos queres darle al médico " + per.get(i).getNombre());
            cantTurnos = en.nextInt();
            for (int j = 0; j < cantTurnos; j++) {
                System.out.println("Agrega la fecha del turno");
                String nuevoTurno = en.next();
                ((Medico) per.get(i)).agregarTurnos(nuevoTurno);
            }
        }

        /*Esto es de antes, lo mismo que arriba pero mas simplon
        for(Persona p: per){
            if(p instanceof Paciente) continue;
            for (int i = 0; i < 3 ; i++) {
                System.out.println("Agrega la fecha del turno");
                String nuevoTurno = en.next();
                ((Medico) p).agregarTurnos(nuevoTurno);
            }
        }*/
        //Mostramos la informacion de cada persona (Hay un operador ternario 
        //para verificar si es paciente o médico)
        for (Persona i : per) {
            System.out.println("");
            System.out.println(((i instanceof Medico) ? "Datos del Medico:" : "Datos del Paciente:")
                    + "\nNombre: " + i.getNombre()
                    + "\nCI: " + i.getCi()
                    + "\n" + ((i instanceof Paciente) ? "Obra social: " + ((Paciente) i).getObraSocial()
                            : "Especialidad: " + ((Medico) i).getEspecialidad() + "\nCantidad de turnos: " + ((Medico) i).cantidadTurnos()));
        }
        
        System.out.println("");
        //Mostramos quien es el medico con más turnos
        String nombreMedico = null;
        int actual = 0;
        int mayor = Integer.MIN_VALUE;
        for (Persona m : per) {
            if (m instanceof Medico meh) {
                actual = meh.cantidadTurnos();
                if (actual > mayor) {
                    mayor = actual;
                    nombreMedico = meh.getNombre();
                }else if (actual == mayor) continue;
            } else {
                continue;
            }
        }
        if (mayor > actual) {
            System.out.println("El medico con más turnos es " + nombreMedico + " con " + mayor);
        } else if (actual == mayor && actual > 0) {
            System.out.println("Los medicos tienen la misma carga horaria =P");
        } else {
            System.out.println("Por el momento no hay medicos trabajando");
        }

    }

}
