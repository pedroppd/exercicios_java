/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02poo;


public class Caneta {
    public float ponta;
    public String cor;
    private String modelo;
    protected int carga;
    protected boolean tampa;
     
    public void estado(){
        System.out.println("COR" + this.cor);
        System.out.println("PONTA" + this.ponta);
        System.out.println("TAMPA" + this.tampa);
        
    }
    public void cor(){
        
    }
    public void tampa(){
        if(this.tampa==true){
            System.out.print("ERRO");
        }else{System.out.print("estou rabiscando");
        
    }
    }
     public void ponta(){
         
     }}
        
    

