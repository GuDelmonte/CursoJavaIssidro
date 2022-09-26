package com.mycompany.aula101issidro;

import java.util.Scanner;

public class Aula101Issidro {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in); 
       
       String nome;
       double salario, vendas;
       double comissao, salarioTotal;
       
        System.out.println("Digite o nome");
        nome = teclado.nextLine();
        System.out.println("Digite o salario");
        salario = teclado.nextDouble();
        System.out.println("Digite o valor das vendas");
        vendas = teclado.nextDouble();
        
        comissao = vendas * 15/100;
        
        salarioTotal = salario + comissao;
        
        System.out.printf("Total = R$ %.2f\n", salarioTotal);
        
    }
}
