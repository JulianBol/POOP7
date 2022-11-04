/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author bolys
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Instanciamos Clase Ballena, Perro y Pajaro que hereda a Animal y AnimalAcuatico.
        Animal animal = new Animal("Oso", "Mexico", "Negro");
        AnimalAcuatico aAcu = new AnimalAcuatico("Tiburon", "California", "Gris", 3);
        AnimalTerrrestre aTer = new AnimalTerrrestre("Caballo", "Texas", "Blanco", 4);
        AnimalAereo aAer = new AnimalAereo("Aguila", "Florida", "Cafe", 2);
        Ballena ballena = new Ballena("Maggi", "Mexico", "Gris", 2, 25);
        Perro perro = new Perro("Jack", "New York", "cafe", 4, "rojo");
        Pajaro pajaro = new Pajaro("Pepe", "Brasil", "Azul", 2, "Curvo");
        
        System.out.println(animal);
        System.out.println(aAcu);
        System.out.println(aTer);
        System.out.println(aAer);
        System.out.println(ballena);
        System.out.println(perro);
        System.out.println(pajaro);
    }
}
