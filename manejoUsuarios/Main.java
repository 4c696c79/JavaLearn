package manejoUsuarios;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static boolean valoracionNum(String text){
        boolean resultado;
        if(text == null) resultado = false;
        try {
            double num = Double.parseDouble(text);
            return resultado = (num > 0) ? true : false;

        } catch (NumberFormatException e) {
            resultado =  false;
        }
        return resultado;
    }
    public static boolean valMail(String mailInput){
        if (mailInput.trim().isEmpty()) return false;
        String[] correos = {"gmail.com", "hotmail.com", "mail.com", "yandex.com", "yahoo.com", "outlook.com"};
        String[] mailcont = mailInput.toLowerCase().trim().split("@");
        if (mailcont.length != 2) return false;

        if (mailcont[0].isEmpty()) return false;

        for(String d : correos){
            if (mailcont[1].equals(d)) {
                return true;
            }
        }
        return false;
    }

    public static void subMenu(Usuarios user, Scanner in){
        System.out.println("Hola " + user.getNombre() + " Eliga una de estas opcinoes");
        boolean es = true;
        while(es){
            System.out.println("1)Ver informacion | 2)Cambiar de estado | 3)Salir");
            int opcion = in.nextInt();
            switch (opcion){
                case 1: user.mostrarInfo();
                    break;
                case 2: user.cambiarEstado();
                System.out.println("Estado cambiado a " + (user.isEstado()? "activo" : "inactivo"));
                break;
                case 3: es = false;
            }

        }
    }

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    ArrayList<Usuarios> arregloU = new ArrayList<>();
    int contID = 0;

    while (true){
        System.out.println(" Eliga una de estas 3 opciones\n 1)Registrarse | 2)Login | 3)Salir");
        int opt = in.nextInt();
        switch (opt){
            case 1:
                System.out.println("Bien, primero que nada digame su nombre:");String nome= in.next();
                System.out.println("Ahora digame su edad");String edad = in.next();
                int edadDef = (!valoracionNum(edad)) ? edadDef = 0 : Integer.parseInt(edad);
                System.out.println("Escriba su correo electronico"); String mail = in.next();
                System.out.println("Por ultimo, escriba su contraseña de usuario"); String contrasenia = in.next();

                if (contrasenia.isEmpty() || !valMail(mail) || nome.isEmpty() || edadDef < 1) {
                    System.out.println("Los campos son invalidos o incompletos");
                }else{
                    contID++;
                    arregloU.add(new Usuarios(contID, nome, mail, contrasenia, edadDef, true));
                    System.out.println("Bienvenido "+nome+ ", su cuenta ha sido creada (っ˘ω˘ς )");
                }
                break;
            case 2:
                if (arregloU.size()>0){
                    System.out.println("Escriba su correo: "); String correoLog = in.next();
                    System.out.println("Escriba su contraseña: "); String contraseñaLog = in.next();
                    Usuarios userLog = null;
                    for(Usuarios us : arregloU){
                        if (us.getCorreo().equals(correoLog) && us.getContra().equals(contraseñaLog)){
                            userLog = us;
                            break;
                        }
                    }
                    if (userLog != null){
                        subMenu(userLog, in);
                    }else{
                        System.out.println("De los "+arregloU.size()+" usuarios registrados no coincide ninguno (-_-;)");
                    }
                }else{
                    System.out.println("No existen usuarios registrados, cree uno para iniciar sesión (￣_￣|||)");
                }


                break;
                case 3:
                    System.out.println("gracias por estar aqui, adios ( •̀ ω •́ )y");
                    System.exit(0);
                    break;
            default: System.out.println("Eliga una de las 3 opciones"); break;
        }
    }

    }

}
