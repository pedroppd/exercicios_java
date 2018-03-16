/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopolimorfismo;

/**
 *
 * @author Everson
 */
public class  Mamifero extends Animais {
    //Atributos 
    protected String corpelo;
    //Metodos

    @Override
    public void emitirSom() {
        System.out.println("emitindo som de mamifero");
    }

    @Override
    public void alimentar() {
         System.out.println(" mamando");
    }

    @Override
    public void locoMover() {
        System.out.println(" correndo ");
    }
    //Metodos especiais

    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }
    
    
}
