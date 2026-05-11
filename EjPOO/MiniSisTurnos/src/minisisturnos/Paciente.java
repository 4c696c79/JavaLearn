package minisisturnos;

public class Paciente extends Persona{
    private String obraSocial;

    public Paciente(int ci, String nombre, String obraSocial) {
        super(ci, nombre);
        this.obraSocial = obraSocial;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
}
