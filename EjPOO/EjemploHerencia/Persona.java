package EjPOO.EjemploHerencia;

public class Persona {
    protected int id;
    protected int edad;
    protected int ci;
    protected String nombre;
    protected String domicilio;

    public Persona(int id, int edad, int ci, String nombre, String dir){
        this.id = id;
        this.edad = edad;
        this.ci = ci;
        this.nombre = nombre;
        this.domicilio = dir;
    }

    public void saludo(){
        System.out.println("Hola, soy " + nombre);
    }
    public void añoDeNacimiento(){
        int añoActual = java.time.LocalDate.now().getYear();//Para acceder al año actual
        System.out.println("Naciste en el año "+ (añoActual-this.edad));
    }

    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    public String getDomicilio() {
        return domicilio;
    }public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public int getEdad() {
        return edad;
    }public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getId() {
        return id;
    }public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
