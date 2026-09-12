/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sisempleado;

import java.util.ArrayList;

public class SisEmpleado {

    public static void main(String[] args) {
        ArrayList<Empleado> emple = new ArrayList<>();
        emple.add(new EmpleadoComision("Juan", 1210000, 3));
        emple.add(new EmpleadoFijo("Pedro", 30000));
        emple.add(new EmpleadoComision("Jose", 5000, 8));
        String salariadoAlto = null;
        int sueldoActual;
        int sueldoMayor = 0;
        for (Empleado empleado : emple) {
            sueldoActual = (int) empleado.getSalarioBase();
            if (sueldoActual > sueldoMayor) {
                sueldoMayor = sueldoActual;
                salariadoAlto = empleado.getNombre();
            }
            empleado.calcularSalario();
            System.out.println("Nombre:" + empleado.getNombre() + "| Salario: " + empleado.getSalarioBase());
        }
        System.out.println("El sueldo actual es de " + salariadoAlto + " Con " + sueldoMayor);

    }

}
