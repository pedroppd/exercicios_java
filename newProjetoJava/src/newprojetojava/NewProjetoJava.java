/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprojetojava;

import java.util.Scanner;


public class NewProjetoJava {

    
    
    
 
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
        for(int c=0;c<=5;c++){
          System.out.println("Digite um numero");
          int num = teclado.nextInt();
         if(num<0){
             System.out.println("esse Numero é negativo!");
         }else if(num>0){
             System.out.println("esse numero é positivo");
         }if(num%2==0){
             System.out.println("esse numero e par");
         }else{
             System.out.println(" esse numero e impar");
         }
        
    }
     
    
}
}
