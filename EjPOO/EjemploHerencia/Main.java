package EjPOO.EjemploHerencia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        //Empleado
        Empleado emple = new Empleado(1,29, 1241242, "Leticia", "Su casa", "Marketing", 19000);
        emple.saludo();
        emple.añoDeNacimiento();
        emple.aumento();
        System.out.println("Quieres cambiar de sueldo?");
        String cambio = en.next();
        if (cambio.toLowerCase().equals("si")) {
            System.out.println("Cuando quiere cambiar? maximo 50.000 >:C");
            double sueldoNuevo = en.nextDouble();
            if (sueldoNuevo > 0 && sueldoNuevo <= 50000) emple.cambioDeSueldo(sueldoNuevo);
            else System.out.println("Ponga un rango aceptable >:P");
        }else {
            System.out.println("Bueno, que lastima :,C");
        }
        //Cliente
        Cliente cli1 = new Cliente(2, 19, 549231, "Julio", "Su casa XD", 2, "JUlioPoderoso2000");
        cli1.saludo();
        cli1.añoDeNacimiento();
        System.out.println("Quieres cambiar de nickname?");
        cambio = en.next();
        if (cambio.toLowerCase().equals("si")) {
            System.out.println("Cual sera su nuevo nickname? Maximo 10 caracteres");
            String nickNuevo = en.next();
            if (nickNuevo.length() <= 30 && !(nickNuevo.isBlank())) cli1.nicknameNuevo(nickNuevo);
            else System.out.println("Muy largo");
        }else {
            System.out.println("Bueno, su nickname actual es:"+cli1.getUsuario());
        }



        en.close();
    }
}
