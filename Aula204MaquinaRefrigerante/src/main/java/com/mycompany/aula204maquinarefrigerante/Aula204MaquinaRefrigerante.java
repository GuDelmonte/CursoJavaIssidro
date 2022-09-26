package com.mycompany.aula204maquinarefrigerante;
import java.util.Scanner;
public class Aula204MaquinaRefrigerante {
    
    
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    MaquinaDeRefri m = new MaquinaDeRefri();
    
    int opcao, res;
    float valor; 
    
    do{
        
        System.out.println(m.mostraInfo());
        System.out.println("Digite 99 para inserir credito");
        System.out.println("Digite -1 para sair");
        System.out.println("Ou digite o numero do refri para comprar (0-4)");
        opcao = teclado.nextInt();
        switch(opcao){
            case 0:
            case 1:
            case 2:
            case 3: 
            case 4:
                res = m.comprar(opcao);
                if (res == 0){
                    System.out.println("Compra Realizada");
                }
                else if (res == -1){
                    System.out.println("Saldo Insuficiente. insira mais $$");
                }
                else{
                    System.out.println("Descupe refrigerante em falta.");
                }
                break;
            
            case 99:
                System.out.println("Digite o valor: ");
                valor = teclado.nextFloat();
                m.inserirCredito(valor);
                break;
            case -1:
                System.out.println("Obrigado por utilizar a maquina");
                System.out.println("Aqui está seu troco" + m.solicitarTroco());
            break;
            default: 
                System.out.println("opcao Invalida");
                break;
        }
    } while (opcao != -1);
    }
}
