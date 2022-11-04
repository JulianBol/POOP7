/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author bolys
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;

    public AnimalAcuatico() {
    }
    
    /**
     * Constructor
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroAletas 
     */
    public AnimalAcuatico(String nombre, String lugarOrigen, String color,int numeroAletas) {
        super(nombre, lugarOrigen, color); // HACE REFERENCIA A LA CLASE ANIMAL.
        this.numeroAletas = numeroAletas;
    }
    
    /**
     * Método que modifica el valor de numeroAletas
     * @param numeroAletas 
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    /**
     * Regresa el numeroAletas
     * @return 
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }
    
    /**
     * Indica si el animal está nadando
     */
    public void nadar(){
        System.out.println("El animal está nadando...");
    }

    @Override
    public String toString() {
        return "AnimalAcuatico{" + super.toString() + "numeroAletas=" + numeroAletas + '}';
    } 
}
