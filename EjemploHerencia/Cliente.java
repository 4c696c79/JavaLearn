package EjPOO.EjemploHerencia;

public class Cliente extends Persona{
    private int idCliente;
    private String usuario;
    public Cliente(int id, int edad, int ci, String nombre, String dir, int idCliente, String usuario){
        super(id, edad, ci, nombre, dir);
        this.idCliente = idCliente;
        this.usuario = usuario;
    }
    @Override
    public void saludo(){
        super.saludo();
        System.out.println("mi nickname es: " +usuario);
    }
    public void nicknameNuevo(String nickNuevo){
        if (!(nickNuevo.isBlank()) && nickNuevo.length() <= 30) {
            System.out.println("Su nickname antiguo:" + usuario+"\nnickname nuevo:"+nickNuevo);
            usuario = nickNuevo;
        }
    }
    
    public int getIdCliente() {
        return idCliente;
    }public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getUsuario() {
        return usuario;
    }public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
