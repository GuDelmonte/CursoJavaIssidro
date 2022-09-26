
package com.mycompany.aula3issidro;

import java.util.Scanner;

public class Aula3Issidro {

    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
       float x, y;
       
       x = teclado.nextFloat();
       y = teclado.nextFloat();
       
       if (x == 0 && y ==0){
            System.out.println("Origem");
       
       }
       else{
           if (x != 0 && y ==0){
           System.out.println("Eixo X");
       } else{
               if (x == 0 && y != 0){
                   System.out.println("Y");
               }
               else{
                   if(x>0&&y>0){
                       System.out.println("Q1");
                   }
                   else{
                       if(x<0 && y >0){
                           System.out.println("Q2");
                       }
                       else {
                           if (x<0 && y<0){
                               System.out.println("Q3");
                           }
                           else{
                               if (x>0&&y<0){
                                   System.out.println("Q4");
                               }
                           }
                       }
                   }
               }
           }
       }
}
}
    

//EXERCÍCIO 4 - APRENDENDO SOBRE SWITCH

/*Scanner teclado = new Scanner (System.in);
        
        int valor = teclado.nextInt();
                switch (valor){
                    case 1:
                        System.out.println("Digitou 1");
                        break;
                    case 2:
                        System.out.println("Digiou 2");
                        break;
                    case 3: 
                        System.out.println("Digitou 3");
                        break;
                    default:
                        System.out.println("Não digitou nem um dos números");
                }*/

// EXERCÍCIO 3 - MENU DE LANCHES: 

 /*Scanner teclado = new Scanner(System.in);
      
      int qtd, cod;
      float total;
      
      cod = teclado.nextInt();
      qtd = teclado.nextInt();
      
      if (cod == 1){
          total = qtd * 4.0f;
      }
      else{
          if (cod == 2){
              total = qtd *4.50f;
          }
          else {
              if (cod == 3){
                  total = qtd * 5.0f;
              }
              else{
                  if (cod == 4){
                      total = qtd * 2.0f;
                  }
                  else{
                      total = qtd * 1.5f;
                  }
              }
          }
      }
        System.out.printf("Total: R$ %.2f\n", total);*/

//EXERCÍCIO 2 -> CALCULAR INTERVALO 

/*
Scanner teclado = new Scanner (System.in);
        float numero = teclado.nextFloat();
        
        if (numero >= 0 && numero <=25.0f){
            System.out.println("Intervalo [0,25]");
        }
        else {
            if (numero > 25.0f && numero <= 50.0f){
                System.out.println("Intervalo [25,50]");
            }
            else{
                if (numero >50.0f && numero <= 75.0f){
                    System.out.println("Intervalo [50,75]");
                }
                else{
                    if (numero > 75.0f && numero <= 100.0f){
                        System.out.println("Intervalo [75,100]");
                    }
                    else{
                        System.out.println("Fora do intervalo");
                    }
                }
            }
        }
*/

//EXERCÍCIO 1 -> CALCULAR MÉDIA

/*
 float n1, n2, media;
        System.out.println("Digite a N1");
        n1 = teclado.nextFloat();
        System.out.println("Digite a N2");
        n2 = teclado.nextFloat();
        
        media = (n1 + n2) / 2;
        
        System.out.println("Média final = " + media);
        
        if (media >= 9.0f){
            System.out.println("Conceito A");
        }
        else{
            if (media >= 8.0f){
                System.out.println("Conceito B");
            }
            else{
                if (media >= 7.0f){
                    System.out.println("Conceito C");
                }
                else{
                    if (media >= 6.0f){
                        System.out.println("Conceito D");
                    }
                    else{
                        System.out.println("Conceito E");
                    }
                }
            }
        }
*/