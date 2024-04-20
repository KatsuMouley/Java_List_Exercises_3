package br.edu.up.modelos;

public class Mercado {
    private double custo, venda;
    public Mercado(double venda, double custo){
        this.venda = venda;
        this.custo = custo;
    }
    

    public double lucro(){
        double lucro;
        lucro = custo - venda;
        return lucro;
    }
}
