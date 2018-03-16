/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herançapoo;

/**
 *
 * @author Everson
 */
public class Funcionario extends Pessoas {
    //Atributos
    private String setor;
    private boolean trabalhando;
    //Metodos
    public void mudarTrabalho(){
        System.out.println("vc mudou de emprego");
        this.trabalhando = ! this.trabalhando;
    }
    //Metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void setNome(String kaio) {
 
    }
}
