package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;

public class Ex14 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        Mercado[] produtos = new Mercado[40];
        double venda, custo;
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Informe o preço de custo do produto ["+(i+1)+"]:");
            custo = input.nextDouble();
            System.out.println("Informe o preço de venda do produto ["+(i+1)+"]:");
            venda = input.nextDouble();
            input.nextLine();
            produtos[i] = new Mercado(venda, custo);
        }
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i].lucro() > 0){
                System.out.println("O produto ["+(i+1)+"] lucrou "+produtos[i].lucro());
            } else if(produtos[i].lucro() == 0){
                System.out.println("O produto ["+(i+1)+"] não lucrou");
            } else if(produtos[i].lucro() < 0){
                System.out.println("O produto ["+(i+1)+"] teve um prejuizo de "+produtos[i].lucro());
            }
        }
        input.close();
    }
}
