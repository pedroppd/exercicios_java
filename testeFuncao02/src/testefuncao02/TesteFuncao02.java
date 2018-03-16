/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

import java.util.Scanner;

/**
 *
 * @author Everson
 */
public class TesteFuncao02 {

  
     
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        for(int c=0;c<=5;c++){
            System.out.println("Digite sua nota: ");
            int nota = teclado.nextInt();
            if(nota>7){
                System.out.println("vc passou!!");
            }else if(nota<7&&nota>=5){
            System.out.println("vc esta de recuperação");
        }else if(nota<5){
                System.out.println("vc esta reprovado!");
                }
        }
        
        
        
        
    }
    
}
