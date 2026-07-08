public class Charmander extends Pokemon implements IFuego{

    public Charmander(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporada, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporada, tipo);
    }
    
    @Override
    protected void atacarPlacaje() {    
        System.out.println("placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("arañazo. Super efectivo =3");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("lanzallamas");}
    
}
