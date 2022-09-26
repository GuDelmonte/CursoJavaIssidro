package com.mycompany.aula106issidro;

import java.util.Scanner;

public class Aula106Issidro {

    public static void main(String[] args) {
   
        int N, R[];
        Scanner teclado = new Scanner (System.in);
        int posQueda=0;
        
        N = teclado.nextInt();
        R = new int [N];
        for (int i=0;i<R.length;i++){
            R[i] = teclado.nextInt();
        }
        
        for(int i = 1; i<R.length;i++){
            if (R[i] < R[i-1]){
                posQueda = i+1;
                break;
            }
        }
        System.out.println(posQueda);
        
        }
      
    }        
    
// EXERCICIO 2: 

/* 
        int X[], N;
        int menor, posMenor;
        Scanner teclado = new Scanner (System.in);
        
        N = teclado.nextInt();
        X = new int [N]; //pego o valor de N e aloco no vetor de X
        
        for (int pos=0; pos<X.length;pos++){
            
            X[pos] = teclado.nextInt();
        }
        
        menor = X[0]; //valor de referência
        posMenor = 0;
        
        for (int pos =0; pos<X.length;pos++){
            if (X[pos] < menor){
                menor = X[pos];
                posMenor = pos;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posMenor);
        */

// EXERCÍCIO 1: 

  /*
        Scanner teclado = new Scanner(System.in);

        String vetor[];
        
        vetor = new String[10];
        
        System.out.println("Digite 10 strings");
        
        for (int pos=0; pos < vetor.length; pos++){
            vetor[pos] = teclado.nextLine();
        }
        System.out.println("--------------------------");
        for (int pos=0;pos<vetor.length;pos++){
            System.out.println("Vetor["+pos+"]="+vetor[pos]);
        }*/