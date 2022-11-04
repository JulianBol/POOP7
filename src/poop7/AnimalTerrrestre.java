/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author bolys
 */
public class AnimalTerrrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrrestre() {
    }
    
    /**
     * Constructor
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroPatas 
     */
    public AnimalTerrrestre(String nombre, String lugarOrigen, String color, int numeroPatas) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    
    /**
     * Método que modifica el valor de numeroPatas
     * @param numeroPatas 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    /**
     * Regresa el valor de numeroPatas
     * @return 
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    
    /**
     * Indica si el animal está corriendo
     */
    public void correr(){
        System.out.println("El animal está corriendo...");
    }

    @Override
    public String toString() {
        return "AnimalTerrrestre{" + super.toString() + "numeroPatas=" + numeroPatas + '}';
    }  
}
