/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentagemmultipla;

import java.util.Scanner;

/**
 *
 * @author Everson
 */
public class PorcentagemMultipla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        int sal = teclado.nextInt();
        int total = 0;
        if(sal<7000){
           total = sal*0
                   15; 
       }else if(sal>7000){
           total = sal*010;
       }
        System.out.println("seu salario total foi " + total);
        
    }
    
}
