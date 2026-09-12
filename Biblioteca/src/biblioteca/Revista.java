package biblioteca;

public class Revista extends Material {

    private int numEdicion;

    public Revista(int numEdicion, String titulo, int anio) {
        super(titulo, anio);
        this.numEdicion = numEdicion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Datos de la revista:\n"
                + "Nombre: " + getTitulo() + "\n"
                + "Edición: " + getNumEdicion() + "\n"
                + "Año: " + getAnio());
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

}
