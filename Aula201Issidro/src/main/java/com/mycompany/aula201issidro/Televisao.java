package com.mycompany.aula201issidro;

public class Televisao {
 
    String marca;
    boolean ligada;
    int volume;
    int canal;
    
    void ligar (){
        ligada = true;
        System.out.println("A TV " + marca+ " Esta ligada");
    }
    
    void aumentarVolume(){
        if (ligada){
            volume++;
            System.out.println("A TV está com o volume: " + volume);
        }
        else{
            System.out.println("Por favor, ligue a tv");
        }
    }
    
    void avancarCanal(){
        if (ligada){
            canal++;
            System.out.println("A tv está no canal: " + canal);
        } else{
            System.out.println("ligue a tv");
        }
    }
    }
    
