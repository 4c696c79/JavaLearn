package EjPOO.ReparadoresCelulares;

public abstract class Usuario {
    protected String nombre;
    protected String correo;
    protected String contra;

    public Usuario(String nombre,String correo, String contrasenia){
        this.nombre = nombre;
        this.correo = correo;
        this.contra = contrasenia;
    }


    public abstract void mostrarRol();

    public String getNombre() {
        return nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
