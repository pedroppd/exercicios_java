/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio270118;

import java.util.Scanner;

/**
 *
 * @author Everson
 */
public class Exercicio270118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     
        int tot=0;
        String c="";
        
        while(c=="s"){
            
            System.out.println("voce quer continuar[s/n]");
            int n =teclado.nextInt();
            
            tot = tot + n;
           
        }
        
         System.out.println(" a soma foi"+tot);
    }
    
}
