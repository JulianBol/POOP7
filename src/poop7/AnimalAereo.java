/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author bolys
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;

    public AnimalAereo() {
    }
    
    /**
     * Constructor 
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroAlas 
     */
    public AnimalAereo(String nombre, String lugarOrigen, String color, int numeroAlas) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * Método que modifica el valor de numeroAlas
     * @param numeroAlas 
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * Regresa numeroAlas
     * @return 
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    
    /**
     * Método que indica si el animal está volando
     */
    public void volar(){
        System.out.println("El animal está volando...");
    }

    @Override
    public String toString() {
        return "AnimalAereo{" + super.toString() + "numeroAlas=" + numeroAlas + '}';
    }
}
