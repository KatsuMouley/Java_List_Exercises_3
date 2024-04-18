package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex3{
    public static void run(){
        Scanner input = new Scanner(System.in);
        String nome;
        double salarioFixo;
        int totalVendas;
        System.out.println("Qual o nome do vendedor?");
        nome = input.nextLine();
        System.out.println("Qual a soma do dinheiro de todas as vendas efetuadas por ele este mês?");
        totalVendas = input.nextInt();
        System.out.println("Qual o seu salário fixo?");
        salarioFixo= input.nextDouble();
        input.nextLine();
        Vendedor vendedor1 = new Vendedor(nome, totalVendas, salarioFixo);
        System.out.println("O vendedor "+vendedor1.getNome()+" fez um total de "+ vendedor1.getTotalVendas() +"R$ em vendas este mês." );
        System.out.println("Seu salário fixo é de "+ vendedor1.getSalarioFixo()+", seu salário este mês foi de "+vendedor1.salarioMes());
        input.close();
    }
}