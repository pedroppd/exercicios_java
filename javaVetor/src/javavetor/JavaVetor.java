/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavetor;

import java.util.Arrays;

/**
 *
 * @author Everson
 */
public class JavaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      /*  int n[]={1,9,9,7};
       
        for (int c=0;c<=3;c++){
            System.out.println("na posição "+c+" temos o valor"+n[c]);
            
        }
        System.out.println("o total de casa de n é " +n.length);*/
    
    
    /*String mes[]={"jan","fev","mar","abril","maio","jun","jul","ago","set","out","nov","dez"};
    int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    for(int c=0;c<mes.length;c++){
        System.out.println("o mes de "+tot+"tem"+tot[c]+"dias ao todo");       
        
    }*/
    double v[] = {2.0,5,2.3};
    Arrays.sort(v);
    for (double valor:v){
        System.out.print(valor+" ");
    
    
    }
    }
    }