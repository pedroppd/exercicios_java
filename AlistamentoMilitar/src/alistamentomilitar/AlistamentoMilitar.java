/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alistamentomilitar;

import java.util.Scanner;

/**
 *
 * @author Everson
 */
public class AlistamentoMilitar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite o seu ano de nascimento: ");
         int nasc = teclado.nextInt();
         idade = 2017 - nasc;
        System.out.println("quem nasceu em "+nasc+" tem "+idade+" em 2017");
         int alistamento=idade-18;
        
        if(idade<alistamento){
            System.out.println("ainda faltam" +alistamento+ "para o seu alistamento");
        }else{
            System.out.println("vc já pode se alistar");
        }
    }
    
}

