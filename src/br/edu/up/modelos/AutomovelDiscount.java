
package br.edu.up.modelos;
public class AutomovelDiscount {
    private int year;
    private double valor;
    private double finalValue;

    public int getYear() {
        return this.year;
    }

    public AutomovelDiscount(int year, double valor){
        this.year = year;
        this.valor = valor;
        this.finalValue = valor;
    }
    public void desconto(int A){
        this.finalValue -= ((valor/100)*A);
    }
    public void showDesconto(){
        System.out.println(finalValue);
    }
    
}