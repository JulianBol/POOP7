/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author bolys
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }

    /**
     * Constructor
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroAlas
     * @param tipoPico 
     */
    public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas, String tipoPico) {
        super(nombre, lugarOrigen, color, numeroAlas);
        this.tipoPico = tipoPico;
    }
    
    /**
     * Método que modifica el valor de "tipoPico"
     * @param tipoPico 
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
     * Regresa el valor de "tipoPico"
     * @return 
     */
    public String getTipoPico() {
        return tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("El pajaro " + super.getNombre() + " está recolectando Ramas...");
    }

    @Override
    public String toString() {
        return "Pajaro{" + super.toString() + "tipoPico=" + tipoPico + '}';
    } 
}
