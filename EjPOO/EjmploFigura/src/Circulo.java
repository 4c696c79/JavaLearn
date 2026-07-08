

public class Circulo implements Figura, Dibujable, Rotable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return 3.14 * (radio * radio);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el circulito =D");
    }

    @Override
    public void rotar() {
        System.out.println("Rotando...");
    }
    
}
