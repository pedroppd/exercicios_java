/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14poo;

/**
 *
 * @author Everson
 */
public class Visualizacao {
    //Atributos
    private Gafanhoto espectador;
    private Video filme;
    //Metodos

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setAssistindo(this.espectador.getAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
                
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
   
    
    
      public void avaliar(){
        this.filme.setAvaliação(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliação((int) nota);
    }
    public void avaliar(float porc){
        this.filme.setAvaliação((int) porc);
    }
}
