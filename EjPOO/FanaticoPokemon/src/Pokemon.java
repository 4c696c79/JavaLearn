
public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporada;
    protected String tipo;

    public Pokemon(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporada, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporada = temporada;
        this.tipo = tipo;
    }
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarArañazo(); 
    protected abstract void atacarMordisco();

    

}
