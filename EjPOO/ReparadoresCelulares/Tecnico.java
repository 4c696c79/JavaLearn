package EjPOO.ReparadoresCelulares;

public class Tecnico extends Usuario{
    String especialidad;
    public Tecnico(String nombre,String correo, String contrasenia, String especialidad){
        super(nombre, correo, contrasenia);
        this.especialidad = especialidad;
    }
    @Override
    public void mostrarRol(){
        System.out.println("Tecnico:" + getNombre() + "\nEspecialidad: " + this.especialidad);
    }
}
