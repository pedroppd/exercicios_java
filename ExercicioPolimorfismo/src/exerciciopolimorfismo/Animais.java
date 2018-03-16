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
public abstract class Animais {
    //Atributos
    private float peso;
    private int idade;
    private int membros;
    //Metodos
    public abstract void emitirSom();
        
    
    public abstract void alimentar();
       
    
    public abstract void locoMover();
        
    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int  getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
