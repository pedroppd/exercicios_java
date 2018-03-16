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
public class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected int experiencia;
    protected String sexo;
    //Metodos

    public Pessoa(String nome, int idade, int experiencia, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.experiencia = 0;
        this.sexo = sexo;
    }
    
    
    protected void ganharExp(){
        this.setExperiencia(this.getExperiencia()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", experiencia=" + experiencia + ", sexo=" + sexo + '}';
    }
    
    
}
