/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Everson
 */
public class MaiorNum {
    private int n1;
    private int n2;
    
    public void MaiorNum(){
       if (n1>n2){
           System.out.println(n1+"é o maior");
       } else if(n2>n1){
           System.out.println(n2+"é o maior");
       }else{
           System.out.println("os numeros sao iguais");
       }
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
}
