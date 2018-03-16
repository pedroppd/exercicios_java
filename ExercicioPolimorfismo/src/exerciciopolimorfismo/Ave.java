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
public class Ave extends Animais {
    //Atributos
    protected String corPena;
    //Metodos
    public void fazerNinho(){
         System.out.println("fazendo ninho");
    }

    @Override
    public void emitirSom() {
        System.out.println("cantando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo frutas");
    }

    @Override
    public void locoMover() {
        System.out.println("voando");
    }
    //Metodos especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
