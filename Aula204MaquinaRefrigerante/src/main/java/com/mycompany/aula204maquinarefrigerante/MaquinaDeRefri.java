package com.mycompany.aula204maquinarefrigerante;


public class MaquinaDeRefri {
    
    private Refrigerante lista[];

    private float credito;
    
    public MaquinaDeRefri(){
        lista = new Refrigerante[5];
        lista [0] = new Refrigerante ("Coca Cola", 2.50f, 5);
        lista [1] = new Refrigerante ("Fanta Uva", 2.0f, 5);
        lista [2] = new Refrigerante ("Fanta Guarana", 1.80f, 5);
        lista [3] = new Refrigerante ("Sprite", 1.50f, 5);
        lista [4] = new Refrigerante ("Xereta Maçã", 1.30f, 5);
        
        this.credito = 0.0f;
        
    }
    
    public void inserirCredito (float valor){
        this.credito += valor;
    }
    
    public float solicitarTroco(){
        float troco = this.credito;
        this.credito = 0.0f;
        return troco;
    }
    
    public int comprar (int numRefri){
        if (this.credito >= lista[numRefri].getPreco()){
            if (lista [numRefri].getQtde() > 0) {
                this.credito -= lista[numRefri].getPreco();
                int novaQtde = lista[numRefri].getQtde() -1;
                lista [numRefri].setQtde(novaQtde);
                return 0;
            }
            else{
                return-2;
            }
        }
        else{
            return -1;
        }
    }
    
    public String mostraInfo(){
        String str="";
        str += "+---------------------------------+\n"+
                "| Maquina de Refrigerante..      |\n"+
                "+---------------------------------+\n"+
                "| Credito R$: " + this.credito + "\n";
        
       
    for (Refrigerante r: lista){
        str += "| " + r.getNome() + " R$ " + r.getPreco()+"\n";
    } 
             str += "+---------------------------------+\n";
                
             return str;
    }
    
}
