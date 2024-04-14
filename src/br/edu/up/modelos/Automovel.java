package br.edu.up.modelos;

public class Automovel { 
    double combustivel;
    int kmP;//kmP é de km Percorridos
    

    public Automovel(){}
    public Automovel(double combusReserv, int kmH){
            this.combustivel = combusReserv;   
            this.kmP = kmH;
    }

    public double consuMedio(){
        return kmP / combustivel;
    }
    
}
