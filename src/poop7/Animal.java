/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author bolys
 */
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;

    public Animal() {
    }
    
    /**
     * 
     * @param nombre
     * @param lugarOrigen
     * @param color 
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    
    /**
     * Método que modifica el valor de nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que modifica el valor de lugarOrigen
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    
    /**
     * Método que modifica el valor de color
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Regresa el "nombre" 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Regresa el "lugarOrigen"
     * @return
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    
    /**
     * Regresa el "color"
     * @return 
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Pinta en pantalla el sonido del animal
     * @param sound 
     */
    public void sonido(String sound){
        System.out.println("El sonido de este animal es: " + sound);
    }
    
    /**
     * Método que indica que el animal está comiendo.
     */
    public void comer(){
        System.out.println("El animal está comiendo...");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    } 
}
