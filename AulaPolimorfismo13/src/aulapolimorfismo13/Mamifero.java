/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapolimorfismo13;

/**
 *
 * @author Everson
 */
public class Mamifero extends Animal{
 //Atributos
    private String corPelo;
    //Metodos
     @Override
    public void emitirSom() {
         System.out.println("Som de mamifero");
    }
    
    
}
