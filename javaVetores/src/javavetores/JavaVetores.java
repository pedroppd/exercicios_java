/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavetores;

import java.util.Arrays;


public class JavaVetores {

    
    public static void main(String[] args) {
//vetor 01
       
      /* int n[]= new int [4];
       n[0]=3;
       n[2]=4;*/
      
//vetor02
      
      /*int n[]={0, 1, 2, 3, 5};
        for(int c=0;c<=n.length-1;c++){
            System.out.println("na posição" + c + "temos o valor " +n[c]);*/
//vetor03
     
      /*String mes[]={"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
      int dias[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
     
      for (int c=0;  c<mes.length; c++){    //.length serve para informa o final do vetor
          System.out.println("o mes de "+mes[c]+" tem "+dias[c]);*/
//vetor04
        /*int c[]={1, 2, 6 , 3, 5, 7, 8};   // para CADA
        Arrays.sort(c); //classe para organizar o vetor
        for(int valor:c){
            System.out.println(valor);*/
//vetor05
       
       /* int num[]={0,2,3,3,5,8,1};
        for(int valor:num){
            System.out.println(valor);
        }
            int p = Arrays.binarySearch(num, 5); // Arrays.binarySearch serve para identificar a posiçao do Vetor
        System.out.println("encontrei o valor na posição"+ p);
        */
//vetor06       
         
        int num []= new int [20];
        Arrays.fill(num, 1); // Arrays.fill serve para por o vetor com os mesmo valor
        for(int valor:num){
            System.out.println(valor+" ");
        }
        }
        }

    
    


