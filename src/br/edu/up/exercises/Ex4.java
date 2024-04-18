package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;

public class Ex4{
    public static void run(){
        Scanner input = new Scanner(System.in);
        double cotacaoDolar, money;
        System.out.println("Qual a cotação do Dolar(R$)?");
        cotacaoDolar = input.nextDouble();
        System.out.println("Quantos dolares você tem($)?");
        money = input.nextDouble();
        input.nextLine();
        Conversor conversion = new Conversor(cotacaoDolar, money);
        System.out.println("Você tem "+ conversion.toReal()+ "R$ em sua conta");
        input.close();
    }
}