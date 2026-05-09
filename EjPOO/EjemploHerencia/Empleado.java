package EjPOO.EjemploHerencia;

public class Empleado extends Persona {
    private double sueldo;
    private String cargo;

    public Empleado(int id, int edad, int ci, String nombre, String dir, String cargo, double sueldo) {
        super(id, edad, ci, nombre, dir);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    @Override
    public void saludo() {
        super.saludo();
        System.out.println("Mi cargo en la empresa es: " + cargo);
    }

    public double aumento() {
        System.out.println("Se le aumento 1000$ a su sueldo :D");
        return (sueldo < 0) ? sueldo + 1000.00 : 0;
    }

    public double cambioDeSueldo(double sueldoNuevo){
        System.out.println("se le cambio el sueldo de "+this.sueldo + " a "+sueldoNuevo);
        return this.sueldo = sueldoNuevo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
