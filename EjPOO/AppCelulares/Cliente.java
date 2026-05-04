package EjPOO.AppCelulares;

public class Cliente extends Usuario{
     private int telefono;
    
     public Cliente (String nombre, String email, String contra, int telefono){
        super(nombre, email, contra);
        this.telefono = telefono;
     }

     @Override
     public void mostrarRol(){
        System.out.println("Rol:Cliente");
     }
}