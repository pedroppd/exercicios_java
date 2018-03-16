/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacondicional;

import java.util.Scanner;

/**
 *
 * @author Everson
 */
public class JavaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        /*System.out.println("digite sua primeiro nota: ");
       float n1 = teclado.nextFloat();
        System.out.println("digite sua segunda nota");
       float n2 = teclado.nextFloat();
       float m = (n1+n2)/2;
        System.out.println(m);
       if (m>9){
           System.out.println("Parabéns");*/
       
        System.out.println("digite seu ano de nascimento: ");
       int nasc = teclado.nextInt();
       int idade = 2017-nasc;
         if(idade>=19){
             System.out.println("você é de maior");
         } else{System.out.println("vc é de menor");
         
         }
       
           
           
           
               
          
           
                   
       }
    }
    

