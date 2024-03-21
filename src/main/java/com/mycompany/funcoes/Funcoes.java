

package com.mycompany.funcoes;

import java.util.Scanner;

/**
 *
 * @author Alexsandre
 */
public class Funcoes {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite 3 números:");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        
        int maior = numeros(a,b,c);
       mostrarResultado(maior); 
      
        
        
        /* if(a > b && a> c){
            System.out.println("O número maior é " + a);
            
        }
        else{
        if( b > c){
            System.out.println("O número maior é " + b);
            
        }
        else{
            System.out.println("O número mair é " + c);
        }}
        */
       
       
    }
            
     
    
    public static int numeros(int a, int b, int c){
     int abc;

     if(a >b && a> c){
         abc = a;
         
     }else     
        if(b > c){
            abc = b;
        }
        else {   
      
          abc = c;
      
      }      
        return abc;
        
        
    }        
       
    public static void mostrarResultado(int maior){
        System.out.println("O número maior é: " + maior);
        
    }
    
}
