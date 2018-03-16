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
public class Gafanhoto extends Pessoa {
    private String login;
    private float assistindo;
    //Metodos

    public Gafanhoto(String nome, int idade, int experiencia, String sexo, String login) {
        super(nome, idade, experiencia, sexo);
        this.login=login;
    }
   
    
    public void viuMaisUm(){
        this.setAssistindo(this.getAssistindo()+1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public float getAssistindo() {
        return assistindo;
    }

    public void setAssistindo(float assistindo) {
        this.assistindo = assistindo;
    }
}
