
package com.mycompany.aula105issidroexercicio2;

import java.util.Scanner;

public class Aula105IssidroExercicio2 {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
    int  R = 0, teste=0; // R = Numero de Rodadas
    int A,B;
    
    int totalA, totalB;
    
    do{
        if(R <= 1){
        teste++;
        R = teclado.nextInt();
        totalA = 0;
        totalB = 0;

        for(int i=0;i<R;i++){

            A= teclado.nextInt();
            B= teclado.nextInt();
            totalA += A;
            totalB += B;
        }
            System.out.println("Teste" + teste);
            if (totalA>totalB){
                System.out.println("Aldo");
            } else{
                System.out.println("Beto");
            }
                System.out.println("");
        }
    } while (R <= 1);
    }
    
}
