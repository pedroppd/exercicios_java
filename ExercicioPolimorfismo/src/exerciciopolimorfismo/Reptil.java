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
public class Reptil extends Animais {
    //Atributos
    protected String cor;
    //Metodos

    @Override
    public void emitirSom() {
        System.out.println("emitindo som de reptil");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo vegetais");
    }

    @Override
    public void locoMover() {
        System.out.println("rastejando");
    }
    //Metodos especiais

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
