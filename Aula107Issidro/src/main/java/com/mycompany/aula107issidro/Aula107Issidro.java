
package com.mycompany.aula107issidro;

import java.util.Scanner;

public class Aula107Issidro {

    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   int n = teclado.nextInt();
   
   int e [][] = new int [n][n];
        
   for (int l=0; l<n; l++){
       for (int c=0;c<n;c++){
           e[l][c] = teclado.nextInt();
       }
   }     
   
   int somaRef = 0;
   for (int c=0;c<n;c++){
       somaRef += e[0][c];
   }
   
   boolean qm = true;
   
   for(int l=1; l<n && qm == true;l++){
       int somaLinha = 0;
       for (int c=0;c<n;c++){
           somaLinha += e[l][c];
       } if (somaLinha != somaRef){
           qm = false;
       }
   }
   
   for (int c=0; c<n && qm == true; c++){
       int somaColuna=0;
       for (int l=0; l<n; l++){
           somaColuna += e[l][c];
       }
       if (somaColuna != somaRef){
           qm = false;
       }
   }
   
   if (qm){
       System.out.println("SIM");
   }
   else {
       System.out.println("NÃO");
   }
    }
}

// EXERCÍCIO 2 

 /*Scanner teclado = new Scanner(System.in);
   
    float matriz [][] = new float [12][12];
    int L;
    char T;

    L = Integer.parseInt (teclado.nextLine());
    T = teclado.nextLine().charAt(0); //charAt pega a primeira letra doq o usuário digitou
    
    for ( int l = 0 ; l<12; l++){
        for (int c=0; c<12;c++){
            matriz[l][c] = teclado.nextFloat();
        }
    }
    
        float res=0;
        for (int c=0; c<12;c++){
            res += matriz[L][c];
        }
        if(T == 'S'){
            System.out.printf("%.1f\n",res);
        }
        else{
            System.out.printf("%.1f\n", res/12);
        }
        */

//EXERCÍCIO 1

/*
Scanner teclado = new Scanner(System.in);
String matriz[][]; //por ser matriz coloco 2 notações de dimensão, uma pra linhas e outra pra colunas
    

    matriz = new String [3][3];
        System.out.println("Digite os Valores");
    
        for (int linha = 0; linha <3; linha++){
            for(int coluna = 0; coluna<3; coluna++){
                matriz[linha][coluna]=teclado.nextLine();
            }
        }
        System.out.println("Imprimindo a matriz\n\n");
        
        for (int l=0;l<3;l++){
        for(int c=0;c<3;c++){
            System.out.printf("%7s", matriz[l][c]);
        }
            System.out.println("");
    }
*/