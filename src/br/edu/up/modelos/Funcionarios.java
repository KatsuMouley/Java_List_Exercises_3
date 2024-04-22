package br.edu.up.modelos;

public class Funcionarios {
    private double salario;

    public Funcionarios(double salario){
        this.salario = salario;
    }

    public void showsalarium(){
        if (salario <= 4500) {
            System.out.println(String.format("%.2f", salario) + " R$ olha o salário desse cara é menor(ou igual) que 3 salarios minimos (A)\n");
        } else if (salario > 4500 && salario <= 15000) {
            System.out.println(String.format("%.2f", salario) + " R$ olha o salário desse cara é maior que 3 salarios minimos e menor(ou igual a) 15000 (B)\n");
        } else if (salario > 15000 && salario <= 30000) {
            System.out.println(String.format("%.2f", salario) + " R$ olha o salário desse cara é maior que 10 salarios minimos e menor(ou igual a) 30000 (C)\n");
        } else {
            System.out.println(String.format("%.2f", salario) + " R$ este funcionário cai na categoria dos demais funcionários(D)\n");
        }
    }

    public void reajuste(){
        if (salario < 4000) {
            salario = salario + (salario/100)*50;
        } else if (salario > 4500 && salario <= 15000) {
            salario = salario + (salario/100)*20;
        } else if (salario > 15000 && salario <= 30000) {
            salario = salario + (salario/100)*15;
        } else {
            salario = salario + (salario/100)*10;
        }
    }
    
}
