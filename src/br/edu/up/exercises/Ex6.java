package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex6{
    public static void run(){
        Scanner input = new Scanner(System.in);
        double money, acrescimo;
        String productName;
        System.out.println("Qual produto você está vendendo?");
        productName = input.nextLine();
        System.out.println("Qual o valor do produto?");
        money = input.nextDouble();
        System.out.println("Qual a porcentagem de acrescimo no valor do produto?");
        acrescimo = input.nextDouble();
        input.nextLine();
        Produto product = new Produto(productName, money, acrescimo);
        System.out.println("O produto '"+ product.getName()+"' tem um valor base de "+ product.getCost()+" e uma taxa de acrescimo de "+ product.getTax()+"%. Sendo seu valor total de "+ product.sumValue());
        input.close();
    }
}
