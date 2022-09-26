
package com.mycompany.aula104issidro;

import java.util.Scanner;

public class Aula104Issidro {

    public static void main(String[] args) {
    
         Scanner teclado = new Scanner (System.in);
         float valor;
         float media;
         int cont;
         
         media = 0f;
         cont = 0;
    
         for (var i=i; i<=6;i++){
             valor=teclado.nextFloat();
             if (valor > 0){
                 media+=valor;
                 cont++; 
             }
         }
    media = media/cont;
        System.out.println(cont + "valores positivos");
        System.out.println("%.1f\n"+media);
    }
}

//EXERCICÍO 4 - BREAK

/*  
      int valor;
      int contador;
      Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um valor");
        valor = teclado.nextInt();
        
        for (contador = 1; contador <= valor; contador ++){
            System.out.println("contador = " + contador);
            if (contador == 5){
                break;
            }
            System.out.println("fim do programa");
        }
        */

// EXERCICIO 3 - FOR

/*
        int valor;
        int contador;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();
        System.out.println("Contando de 1 até o valor");
        for(contador = 1; contador <= valor; contador++){
            System.out.println("valor do contador = " + contador);
        }
        */

//EXERCICIO 2 - DO WHILE
    
    /*
        Scanner teclado = new Scanner (system.in);
        int valor;
        int contador;
        
        System.out.println("Digite um valor:");
        valor = teclado.nextInt();
        System.out.println("Contando de 1 até o valor");
        contador = 1;
        
        do{
            System.out.println("valor do contador = " + contador);
            contador++;
        } while (contador <= valor);
    }
    */
    
// EXERCÍCIO 1 - WHILE
        /*
        int valor;
        int contador;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um valor");
        valor = teclado.nextInt();
        System.out.println("Contando de 1 até chegar no valor");
        contador = 1;
        while(contador <= valor){
            System.out.println("valor do contador = "+ contador);
            contador++;
            
}
        */


