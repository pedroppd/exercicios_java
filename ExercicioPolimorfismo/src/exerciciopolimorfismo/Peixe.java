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
public class Peixe extends Animais {
    //Atributos
    protected String corEscama;
    //Metodos
    public void soltandoBolhar(){
        System.out.println("soltando bolhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("nao posso emitir som");
    }

    @Override
    public void alimentar() {
        System.out.println(" comendo comida de peixe");
    }

    @Override
    public void locoMover() {
        System.out.println("nadando");
    }
    //Metodos especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
