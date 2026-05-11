package minisisturnos;

import java.util.ArrayList;

public class Medico extends Persona{
    private String especialidad;
    ArrayList<String> turnos = new ArrayList<>();

    public Medico(int ci, String nombre, String especialidad) {
        super(ci, nombre);
        this.especialidad = especialidad;
    }

    //Methods :3
    public void agregarTurnos(String fecha){
        turnos.add(fecha);
    }
    public void mostrarTurnos(){
        for(String tur : turnos){
            System.out.println(tur);
        }
    }
    public int cantidadTurnos(){
        return turnos.size();
    }

    //Getter and setters

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<String> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<String> turnos) {
        this.turnos = turnos;
    }
}
