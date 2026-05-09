package EjPOO.SistemaEmpleado;

public class EmpleadoComision extends Empleado {
    private int cantVentas;
    public EmpleadoComision(String nombre, double salarioBase, int cantVentas) {
        super(nombre, salarioBase);
        this.cantVentas = cantVentas;
    }
    @Override
    public void calcularSalario() { 
    }
    public void aumentoSalario(boolean confirmacion){
        if (confirmacion) {
            salarioBase = salarioBase + (salarioBase * 0.15);
        }
    }

}
