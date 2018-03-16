/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordepagamentos;

import java.util.Scanner;

/**
 *
 * @author Everson
 */
public class GerenciadorDepagamentos {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
                
        System.out.println("qual o valor das compras: ");
        float valor = teclado.nextFloat();
        System.out.println("---FORMA DE PAGAMERNTO---");
        System.out.println("[1] a vista no cartão");
        System.out.println("[2] a vista dinheito ou cheque");
        System.out.println("[3]2 vezes no cartao");
        System.out.println("[4] 3 vezes ou mais no cartao");
        System.out.println("qual é a opção?");
        float pag = teclado.nextFloat();
        if(pag==1){
           double total = valor-10%
                   
        }
    }
}
        
        
                
    



