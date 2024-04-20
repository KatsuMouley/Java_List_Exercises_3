package br.edu.up.exercises;
import java.util.Scanner;
import br.edu.up.modelos.AutomovelDiscount;

public class Ex12 {
    public static void run() {
        Scanner input = new Scanner(System.in);
        double valor;
        int year;
        //2000 < x = 12%, 2000 > x = 7%
        System.out.println("Insira o ano do veículo;");
        year = input.nextInt();
        System.out.println("Insira o valor do veículo;");
        valor = input.nextDouble();
        AutomovelDiscount car = new AutomovelDiscount(year, valor);
        char I;
        do {
            if (car.getYear() < 2000) {
                car.desconto(12);
            } else if (car.getYear() > 2000){               
                car.desconto(7);
            }
            System.out.println("Deseja continuar a calcular o desconto? (n)não (y)sim");
            I = input.next().charAt(0);
        } while (I != 'n' && I != 'N');
        car.showDesconto();
        input.close();
    }
} 
