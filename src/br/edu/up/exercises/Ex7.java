package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex7{
    public static void run(){
        Scanner input = new Scanner(System.in);
        double money;
        System.out.println("Qual o custo de fabrica do carro?");
        money = input.nextDouble();input.nextLine();
        Carro car = new Carro(money);
        System.out.printf("O custo total do carro será de %.2fR$\n", car.imposto());
        input.close();
    }
}
