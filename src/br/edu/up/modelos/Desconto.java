package br.edu.up.modelos;

public class Desconto {
    private double valor;
    private char gas;

    public Desconto(char gas, double valor){
        this.gas = gas;
        this.valor = valor;
    }
    public double desconto(int A){ 
        double discount = 0;
        if (gas == 'g' || gas == 'G') {
            discount = 21;
        } else //Diesel
        if (gas == 'd' || gas == 'D') {
            discount = 14;
        } else //Álcool
        if (gas == 'a' || gas == 'A') {
            discount = 25;
        }
        return valor-((valor/100)*discount);
    }
}