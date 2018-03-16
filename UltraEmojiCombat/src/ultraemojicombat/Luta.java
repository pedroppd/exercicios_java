/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Everson
 */
public class Luta  {
    //Atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    //Metodos
    public void marcarluta(Lutador l1, Lutador l2){
    if(l1.getCategoria()==l2.getCategoria() && l1!=l2){
       this.aprovada = true;
       desafiado =l1;
       desafiante=l2;
    }else{
       this.aprovada = false;
       desafiado = null;
       desafiante= null;
       
    }
           
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("$$ DESAFIADO $$");
            this.desafiado.apresentar();
            System.out.println("$$ DESAFIANTE $$");
           this.desafiante.apresentar();
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3); // 0,1,2
           if(vencedor==0){
               System.out.println("a luta empatou");
               this.desafiado.empatarLuta();
               this.desafiante.apresentar();
           }else if(vencedor==1){
               System.out.println("o vencedor foi " +this.desafiado.getNome());
               this.desafiado.ganharLuta();
               this.desafiante.perderLuta();
           }else if(vencedor==2){
               System.out.println(" o vencedor foi " +this.desafiante.getNome());
               this.desafiado.perderLuta();
               this.desafiante.ganharLuta();
           }
        }else{
            System.out.println(" a luta nao pode acontecer!!");
        }
    }
    //metodos especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
            
}
