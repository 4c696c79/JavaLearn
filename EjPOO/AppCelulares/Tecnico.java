package EjPOO.AppCelulares;

public class Tecnico extends Usuario {
    private String especialidad;

    public Tecnico(String nombre, String email, String contra, String especialidad) {
        super(nombre, email, contra);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol:Técnico | especialidad: " + especialidad);
    }
}
