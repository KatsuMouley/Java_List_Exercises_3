package br.edu.up.modelos; 

public class Conversor {
    private double cotacaoDoDolar, money;

    public Conversor(double cotacaoDoDolar, double money){
        this.cotacaoDoDolar = cotacaoDoDolar;
        this.money = money;
    }
    
    public double toReal(){
        return cotacaoDoDolar * money;
    }

}
