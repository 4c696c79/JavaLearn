package EjPOO;

public class Usuario {
    private String nombre;
    private int ci;
    private String correo;

    public Usuario(String nombre, int ci, String correo) {
        this.nombre = nombre;
        this.ci = ci;
        this.correo = correo;
    }

    public void mostrarInfo() {
        System.out.println("Usuario: " + nombre + " | Correo: " + correo);
    }


    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCi() {
        return ci;
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

    public String getNombre() {
        return nombre;
    }

} 
//El super es para poder tomar los datos de la clase padre
class Tecnico extends Usuario{
    private String especialidad;
    private int cantTrabajos;

    public Tecnico(String nombre, int ci, String correo, String especi, int cantT){
        super(nombre, ci, correo);
        this.especialidad = especi;
        this.cantTrabajos = cantT;
    }

    public int trabajoHechos(){
        return cantTrabajos++;
    }

}

class Cliente extends Usuario {
    private String direccion;

    public Cliente(String nombre, int ci, String email, String dir){
        super(nombre, ci, email);
        this.direccion = dir;
    }

    @Override//@Override es para reemplazar el metodo padre para adaparlo a tu clase
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Direccion: " + direccion);
    }
}