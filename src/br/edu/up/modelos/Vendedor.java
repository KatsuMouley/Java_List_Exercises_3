package br.edu.up.modelos;

public class Vendedor {
    private String nome;
    private int totalVendas;
    private double salarioFixo;

    public Vendedor(){}
    
    public Vendedor(String name, int totalSells, double salary){
        this.nome = name;
        this.totalVendas = totalSells;
        this.salarioFixo = salary;
    }
    public double salarioMes(){
        return (totalVendas*0.15)+salarioFixo;
    }

    public String getNome() {
        return nome;
    }
    public int getTotalVendas() {
        return totalVendas;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }

    
}
