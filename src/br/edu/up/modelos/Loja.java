package br.edu.up.modelos;

public class Loja {

    private double money;
    
    public Loja(double coins){
        this.money = coins;
    }
    public double parcela(int parcelado){
        return money/parcelado;
    }
    
}
