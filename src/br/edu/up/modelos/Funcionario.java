package br.edu.up.modelos;

public class Funcionario {
    private double salario, salarioFun, salarioMin, abono = 0;
    private String name;
    private int reajuste, idade;
    private char sexo;


    public double getSalario() {
        return salario;
    }

    public double getSalarioFun() {
        return salarioFun;
    }

    public double getSalarioMin() {
        return salarioMin;
    }

    public String getName() {
        return name;
    }

    public int getReajuste() {
        return reajuste;
    }

    public Funcionario(double salario){
        this.salario = salario;
    }

    public Funcionario(String name, double salarioFun, double salarioMin){
        this.name = name;
        this.salarioFun = salarioFun;
        this.salarioMin = salarioMin;
        if (salarioFun < salarioMin*3) {
            this.reajuste = 50;
        } else if (salarioFun > salarioMin*3 && salarioFun <= salarioMin*10) {
            this.reajuste = 20;
        } else if (salarioFun > salarioMin*10 && salarioFun <= salarioMin*20) {
            this.reajuste = 15;
        } else {
            this.reajuste = 10;
        }
    }
    
    public Funcionario(String name, int idade, char sexo, double salario){
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
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

    public void reajuste1(){
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
    
    public double reajuste2(){
        if (salarioFun < salarioMin*3) {
            this.reajuste = 50;
            return (salarioFun+(salarioFun*0.50)/*reajuste de 50%*/);
        } else if (salarioFun > salarioMin*3 && salarioFun <= salarioMin*10) {
            this.reajuste = 20;
            return (salarioFun+(salarioFun*0.20));
        } else if (salarioFun > salarioMin*10 && salarioFun <= salarioMin*20) {
            this.reajuste = 15;
            return salarioFun = salarioFun + (salarioFun*0.15);
        } else {
            this.reajuste = 10;
            return salarioFun = salarioFun + (salarioFun/0.1);
        }
    }

    public void abono(){
           // Calculando o abono conforme o sexo e a idade
           if (sexo == 'M' || sexo == 'm') {
               if (idade >= 30) {
                   abono = 100.00;
               } else {
                   abono = 50.00;
               }
           } else if (sexo == 'F' || sexo == 'f') {
               if (idade >= 30) {
                   abono = 200.00;
               } else {
                   abono = 80.00;
               }
           } else {
               System.out.println("Sexo inválido!");
           }
    }
    public double salarioLiq(){
           return salario + abono;
    }
}
