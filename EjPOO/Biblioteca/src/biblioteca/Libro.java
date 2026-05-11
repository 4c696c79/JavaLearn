/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author ali
 */
public class Libro extends Material {
    private String autor;

    public Libro(String autor, String titulo, int anio) {
        super(titulo, anio);
        this.autor = autor;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Datos del libro:\n"
                + "Nombre: "+getTitulo() + "\n"
                + "Autor: " +getAutor() + "\n"
                + "Año: " +getAnio());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
