package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex18{
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do(a) funcionário(a)");
        String name = input.nextLine();
        System.out.println("Qual a idade do(a) funcionário()a?");
        int idade = input.nextInt();
        System.out.println("Qual o sexo do(a) funcionário(a)? (m)male (f)female");
        char sexo = input.next().charAt(0);
        System.out.println("Insira o salário do(a) funcionário(a)");
        double salarioFun = input.nextDouble();
        Funcionario funcionario = new Funcionario(name, idade, sexo, salarioFun);
        funcionario.abono();
        System.out.println("Nome do funcionário: " + funcionario.getName());
        System.out.println("Salário líquido: R$" + funcionario.salarioLiq());

        input.nextLine();
        input.close();
    }
}