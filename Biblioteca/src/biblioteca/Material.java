package biblioteca;
public abstract class Material {
    protected String titulo;    
    protected int anio;

    public Material(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }
    //Metodo abtracto
    public abstract void mostrarInfo();
    
    //GETTER AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    

}
