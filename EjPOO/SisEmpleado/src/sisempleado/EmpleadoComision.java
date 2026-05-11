package sisempleado;

public class EmpleadoComision extends Empleado {
    private int cantVentas;

    public EmpleadoComision(String nombre, double salarioBase, int cantVentas) {
        super(nombre, salarioBase);
        this.cantVentas = cantVentas;
    }
    @Override
    public void calcularSalario(){
        double bono = (this.salarioBase * 0.15) * cantVentas;
        this.salarioBase = this.salarioBase + bono;
    }
    
}
