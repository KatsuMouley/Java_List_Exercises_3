package br.edu.up.modelos;

public class Produto{
    private String name;
    private double cost, tax;

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getTax() {
        return tax;
    }

    public Produto(){}

    public Produto(String nameP, double costP){
        this.name = nameP;
        this.cost = costP;
    }
    public Produto(String nameP, double costP, double taxP){
        this.name = nameP;
        this.cost = costP;
        this.tax = taxP;
    }
    
    public double sumValue(){
    return cost+(cost*(tax/100));
    } 
    
}
