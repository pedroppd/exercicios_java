/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Everson
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
  Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = teclado.nextLine();
        System.out.println("digite sua idade");
        float idade = teclado.nextFloat();
        System.out.printf("seu nome é %s e sua idade é %.0f anos ", nome, idade );
       
             
    }
    
}
