/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author bolys
 */
public class Perro extends AnimalTerrrestre{
    private String colorCollar;

    public Perro() {
    }

    /**
     * Constructor
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroPatas
     * @param colorCollar 
     */
    public Perro(String nombre, String lugarOrigen, String color, int numeroPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numeroPatas);
        this.colorCollar = colorCollar;
    }
    
    /**
     * Método que modifica el valor de "colorCollar"
     * @param colorCollar 
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Regresa el valor de "colorCollar"
     * @return 
     */
    public String getColorCollar() {
        return colorCollar;
    }
    
    public void hacerTrucos(){
        System.out.println("El perro " + super.getNombre() + " está haciendo trucos...");
    }

    @Override
    public String toString() {
        return "Perro{" + super.toString() + "colorCollar=" + colorCollar + '}';
    }  
}
