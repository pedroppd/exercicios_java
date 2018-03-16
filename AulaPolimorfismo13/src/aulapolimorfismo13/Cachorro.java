/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapolimorfismo13;

/**
 *
 * @author Everson
 */
public class Cachorro extends Lobo{
     @Override
    public void emitirSom() {
         System.out.println(" au au au au");
    }
    public void reagir(String frase){
        if(frase=="toma comida"){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("rosnar");
        }
    }
    public void reagir(int hora, int min){
        if(hora<12){
            System.out.println("abanar");
        }else if(hora>=18){
            System.out.println("ignorar");
        }else{
            System.out.println("abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if(dono=true){
            System.out.println("abanar");
        }else{
            System.out.println("rosnar e latir");
        }
    }
    public void reagir(int idade, float peso){
        if (idade<5){
            System.out.println("abanar e latir");
        }else if(idade>6){
            System.out.println("rosnar");
        }if(peso<20){
            System.out.println("correr");
        }else if(peso>47){
            System.out.println("comer e dormir");
        }
            
    }
}
