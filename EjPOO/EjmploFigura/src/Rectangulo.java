
public class Rectangulo implements Figura, Dibujable{
    private double lado;
    private double ancho;
    
    public Rectangulo(){}
    public Rectangulo(double lado, double ancho){
    this.lado = lado;
    this.ancho = ancho;
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando un rectangulo...");
        
    }
    @Override
    public double calcularArea() {
        return lado * ancho;
    }
}
