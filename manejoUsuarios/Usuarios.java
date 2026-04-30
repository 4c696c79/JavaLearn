package manejoUsuarios;

public class Usuarios
{
private int id;
private String nombre;
private String correo;
private String contra;
private int edad;
private boolean estado = false;

    //contructor
    public Usuarios (int id, String nombre, String correo, String contra, int edad, boolean estado){
    this.id = id;
    this.nombre = nombre;
    this.correo = correo;
    this.contra = contra;
    this.edad = edad;
    this.estado = estado;
    }

    public void mostrarInfo(){
        if(!estado){
            System.out.println("Tu cuenta esta desactivada, no puedes accederesta informacion");
        }else{
            System.out.println("Informacion del usuario\nID:"+id+" | Nombre:" + nombre + " | Edad:"+edad+ "\nCorreo:"+correo+" | Estado " + (estado ? "Activo" : "Inactivo")+"\n"+valEdad());

        }
    }

    public String valEdad(){
        return (this.edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad" ;
    }

    public void cambiarEstado(){
        if (this.estado == false) this.estado = true;
        else this.estado = false;
    }


    //Getter y Setters
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
