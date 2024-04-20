package br.edu.up.exercises;
import java.util.Scanner;
import br.edu.up.modelos.*;
public class Ex15 {
    public static void run() {
        Scanner input = new Scanner(System.in);
        double valor;
        char gas = 'N';
        
        System.out.println("Insira o valor do veículo;");
        valor = input.nextDouble();
        if (valor != 0) {
            System.out.println("Qual o tipo de gasolina do veículo?");
            System.out.println("A) Àlcool");
            System.out.println("G) Gasolina");
            System.out.println("D) Diesel");
            gas = input.next().charAt(0);
        }
        int discount = 0;//Gasolina
        GasDiscount car = new GasDiscount(gas, valor);
        System.out.println("A porcentagem do desconto é de "+discount+"%");
        System.out.println("O cliente ira pagar no total "+car.desconto(discount)+" R$");
        
        input.close();
    }
} 
