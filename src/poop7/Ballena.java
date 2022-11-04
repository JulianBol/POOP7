/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author bolys
 */
public class Ballena extends AnimalAcuatico{
    private int largo;

    public Ballena() {
    }
    
    /**
     * Constructor
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroAletas
     * @param largo 
     */
    public Ballena(String nombre, String lugarOrigen, String color, int numeroAletas, int largo) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }

    /**
     * Método que modifica el valor de "largo"
     * @param largo 
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Regresa el valor de "largo"
     * @return
     */
    public int getLargo() {
        return largo;
    }
    
    public void pelearConPinocho(){
        System.out.println("La Ballena " + super.getNombre() + " esta peleando con Pinocho");
    }

    @Override
    public String toString() {
        return "Ballena{" + super.toString() + "largo=" + largo + '}';
    }
}
