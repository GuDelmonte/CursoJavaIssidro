
package com.mycompany.aula201issidro;

public class Aula201Issidro {

    public static void main(String[] args) {
      Televisao t1 = new Televisao();
      Televisao t2 = new Televisao();
      
      t1.marca = "LG";
      t1.ligada= false;
      t1.volume=0;
      t1.canal=5;
      
      t1.ligar();
      t1.aumentarVolume();
      t1.avancarCanal();

      t2.marca = "Samsung";
      t2.ligada= false;
      t2.volume=0;
      t2.canal=5; 
      
      t2.ligar();
      
        }
    
}