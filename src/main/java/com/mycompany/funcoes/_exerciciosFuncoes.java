
package com.mycompany.funcoes;

import java.util.Scanner;

/**
 *
 * @author Alexsandre
 */
public class _exerciciosFuncoes {
    public static void main(String[] args) {
        System.out.println("Calculadora\n\n");
        Scanner teclado = new Scanner(System.in);
       Scanner teclado2 = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite o sinal desejado:"
                + "\n+ = somar\n"
                + "- = subtrair\n"
                + "* = multiplicar\n"
                + "/ = dividir\n"
                + "@ = resultado ao cubo");
       String sinal = teclado2.nextLine();
        
     
       
       if(sinal.equalsIgnoreCase("+")){
        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("O resultado é: "+ numeros (num1,num2));
      
    }
       else{
           
        if(sinal.equalsIgnoreCase("-")){
           System.out.println("Digite o segundo número: ");
            int num2 = teclado.nextInt();
           System.out.println("O resultado é: "+ numeros1 (num1,num2));      
            
        }
        else{
        if(sinal.equalsIgnoreCase("*")){
          System.out.println("Digite o segundo número: ");
            int num2 = teclado.nextInt();
            System.out.println("O resultado é: "+ numeros2 (num1,num2));
            
        }else{
            if(sinal.equalsIgnoreCase("/")){
               System.out.println("Digite o segundo número: ");
                int num2 = teclado.nextInt();
                  System.out.println("O resultado é: "+ numeros3 (num1,num2));
               
                
                
            }else{
                if(sinal.equalsIgnoreCase("@")){
                 
                    System.out.println("O resultado é: "+ numeros4(num1));
                    
                    
                }else{
                
                
                System.out.println("Sinal inválido");
                
            }}}}}
         
       
       
        
        
        
        
   ////////////////////////////////////////////////////////////////////////    
       
    }
    
    public static int numeros(int soma1, int soma2){
     
       return soma1 += soma2;
       

    }
    
    ///////////////////
    public static int numeros1 (int menos1, int menos2){
        
        return menos1 -= menos2;
        
        
    }
    public static int numeros2 (int vezes1, int vezes2){
        
        return vezes1 *= vezes2;
        
        
    }
    ////////////////////////////
    public static int numeros3 (int divisao1, int divisao2){
        
        return divisao1 /= divisao2;
        
    }
    public static int numeros4 (int potencia1){
   
     
        
         return (int)Math.pow(potencia1, 3);
        
    }
    
    
   
     
     
     
}
