package biblioteca;

public class Podcast extends Material {

    private int duracionMinutos;

    public Podcast(int duracionMinutos, String titulo, int anio) {
        super(titulo, anio);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Datos del podcast:\n"
                + "Nombre: " + getTitulo() + "\n"
                + "Edición: " + getDuracionMinutos()+ "\n"
                + "Año: " + getAnio());
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
    
}
