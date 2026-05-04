package EjPOO.AppCelulares;

public abstract class Usuario{
    protected String nombre;
    protected String email;
    protected String contra;
    
    protected Usuario(String nome, String email, String contra){
        this.nombre = nome;
        this.email = email;
        this.contra = contra;
    }
    protected abstract void mostrarRol();


}
