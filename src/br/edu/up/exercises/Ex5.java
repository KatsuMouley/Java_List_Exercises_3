package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex5{
    public static void run(){
        Scanner input = new Scanner(System.in);
        double money;
        System.out.println("Qual o valor da compra?");
        money = input.nextDouble();
        input.nextLine();
        Loja prestacao = new Loja(money);
        System.out.println("Você realizou uma compra na loja Mamão com açucar, e o pagamento será realizado em 5 prestações sem juros, sendo cada uma no valor de "+ prestacao.parcela(5)+"R$");
        input.close();
    }
}