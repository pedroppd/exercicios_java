/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Everson
 */
public class Lutador implements LutadorMetodos {
   //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
   //Metodos publicos

    @Override
    public void apresentar() {
        System.out.println("NOME: "+this.getNome());
        System.out.println("VITORIAS: "+this.getVitorias());
        System.out.println("DERROSTAS: "+this.getEmpates());
        System.out.println("NACIONALIDADE: "+this.getNacionalidade());
        System.out.println("IDADE: "+this.getIdade());
        System.out.println("ALTURA: "+this.getAltura());
        System.out.println("PESO: "+this.getPeso());
        System.out.println("CATEGORIA: "+this.getCategoria());
    }

    @Override
    public void status() {
         System.out.println("NOME:"+this.getNome());
         System.out.println("CATEGORIA"+this.getCategoria());
         System.out.println("NACIONALIDADe"+this.getNacionalidade());
         
    }

    @Override
    public void ganharLuta() {
         this.setVitorias(getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
          setEmpates(getEmpates()+1);
    }
    
   //Metodos especiais  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    private void setCategoria() {
        if(this.peso<52){
           this.categoria ="invalido";
        }else if(this.peso<=73.3){
                categoria ="leve";
        }else if(this.peso<=83.9){
                categoria="médio";
        }else if (this.peso<=120.2){
                categoria="peso pesado";
        }else{
                categoria="invalido";
        }
                
        
    }

}
