
package com.mycompany.aula102issidro;

import java.util.Scanner;

public class Aula102Issidro {

    public static void main(String[] args) {
   
    Scanner teclado = new Scanner (System.in);
    
    double A, B, C, R1, R2, delta;
    
    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();
    
    delta = B*B - 4*A*C;
    
    if (delta < 0 || A == 0){
        System.out.println("Impossível calcular");
    }
    else {
        R1 = (-B + Math.sqrt(delta))/(2*A);
        R2 = (-B - Math.sqrt(delta))/(2*A);
        
        System.out.printf("R1 = %.5f\n", R1);
        System.out.printf("R2 = %.5\n", R2);
    }
        
        
        
    }
}


// Exercício 2 

/*Scanner teclado = new Scanner (System.in);
        int A, B,C, D;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        
        if((B > C) && (D>A) && (C+D > A+B) && (C > 0) && (D > 0) && (A%2==0)){
            System.out.println("Valores Aceitos");
        } 
        else{
            System.out.println("Valores não aceitos");
}/*

// Exercício 1

/*    Scanner teclado = new Scanner (System.in);
        int valor;
        
        System.out.println("Digite um valor inteiro ");
        
        valor = teclado.nextInt();
        
        if (valor >= 0 ){
            System.out.println("Valor Positivo");
        }
        else{
            System.out.println("Valor Negativo");
        }
        
        System.out.println("Fim do programa");*/