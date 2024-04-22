package br.edu.up.modelos;

public class Nadador{
    private int age;
    public Nadador(int age){
        this.age = age;
    }

    public String categoria(){
        if (age >= 5 && age <= 7) {
            return "Infantil A";
        } else if (age >= 8 && age <= 10) {
            return "Infantil B";
        } else if (age >= 11 && age <= 13) {
            return "juvenil A";
        } else if (age >= 14 && age <= 17) {
            return "juvenil B";
        } else if (age >= 18 && age <= 25) {
            return "Sênior";
        } else 
        {
        return "idade fora da faixa etária";
        }
    }
}