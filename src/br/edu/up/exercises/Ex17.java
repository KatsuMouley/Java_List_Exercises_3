package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex17{
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do funcionário");
        String name = input.nextLine();
        System.out.println("Insira o salário do funcionário");
        double salarioFun = input.nextDouble();
        System.out.println("Qual o salário minimo?");
        double salarioMin = input.nextDouble();
        Funcionario funcionario = new Funcionario(name, salarioFun, salarioMin);
        System.out.println("O funcionário "+ funcionario.getName() + " teve um reajuste de "+funcionario.getReajuste()+"%, seu novo salário é "+funcionario.reajuste2());
        System.out.println("A empresa vai aumentar sua folha de pagamento em "+(funcionario.reajuste2()-salarioFun)+" R$");
        input.nextLine();
        input.close();
    }
}