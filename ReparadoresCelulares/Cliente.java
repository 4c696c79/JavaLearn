package EjPOO.ReparadoresCelulares;

public class Cliente extends Usuario{
    private int telefono;

    public Cliente(String nombre, String correo, String contrasenia, int tel){
        super(nombre, correo, contrasenia);
        this.telefono = tel;
    }

    @Override
    public void mostrarRol(){
        System.out.println("Hola, soy el Cliente "+ getNombre() + " :D");
    }

}