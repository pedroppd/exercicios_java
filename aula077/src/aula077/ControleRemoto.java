/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula077;

/**
 *
 * @author Everson
 */
public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //metodo construtor
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
        
     //metodos getter e setter   
    
}

    private  int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Metodos

    @Override
    public void ligar() {
      this.setLigado(true);
    }

    @Override
    public void desligar() {
      this.setLigado(false);
    }

    @Override
    public void mudo() {
     if(this.getLigado() && this.getVolume()==0){
        this.setVolume(0);
    }
    }
    

    @Override
    public void abrirmenu() {
        System.out.println("------------MENU-----------");
        System.out.println("esta ligado"+ this.getLigado());
        System.out.println("esta tocando"+this.getTocando());
        System.out.println("Volume:"+this.getVolume());
        for(int i=0;i<=this.getVolume();i+=10){
            System.out.println("/");
        }
    }

    @Override
    public void fecharmenu() {
        System.out.println("fechando menu");
    }

    @Override
    public void play() {
      if(this.getLigado()&& !this.getTocando()){
          this.setTocando(true);
      }
    }

    @Override
    public void pause() {
      if (this.getLigado() && this.getTocando()){
          this.setTocando(false);
      }
    }

    @Override
    public void ligarmudo() {
        if(this.getLigado()&& this.getVolume()>0){
            this.setVolume(0);
        }

    }

    @Override
    public void menosvolume() {
      if(this.getLigado()){
          this.setVolume(this.getVolume()+5);
      }
    }

    @Override
    public void maisvolume() {
      if(this.getLigado()){
          this.setVolume(this.getVolume()+5);
      }
    }
    
}
