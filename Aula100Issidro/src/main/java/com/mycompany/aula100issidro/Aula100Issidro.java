
/*Objetivo: Ler um valor inteiro que represente a idade de uma pessoa em dias
e represente isso em ano, meses e dias*/

//todo ano tem 365 dias

// todo mes tem 30 dias

package com.mycompany.aula100issidro;

import java.util.Scanner;

public class Aula100Issidro {

    public static void main(String[] args) {
        int anosEmDias;
        int qtdAnos, qtdMeses,qtdDias;
        int resto;
        
        System.out.println("Digite quantos dias de vida você tem");
        
        Scanner teclado = new Scanner(System.in);
        anosEmDias = teclado.nextInt();
        
        qtdAnos = anosEmDias / 365;
        
        resto = anosEmDias % 365;
        
        qtdMeses = resto/30;
        
        qtdDias = resto %30;
        
        System.out.println(qtdAnos + " ano(s)");
        System.out.println(qtdMeses +" mes(es)");
        System.out.println(qtdDias + " dia(as)");
        
    }
}
