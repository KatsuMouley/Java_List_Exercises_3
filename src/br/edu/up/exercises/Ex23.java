package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;

public class Ex23 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual nome do indíviduo?");
        String name = input.nextLine();
        System.out.println("Qual sua idade?");
        int age = input.nextInt();
        System.out.println("Qual seu sexo? \n(M)male\n(F)female");
        char gender = input.next().charAt(0);
        System.out.println("Qual seu peso?");
        double weight = input.nextDouble();
        System.out.println("Qual sua altura?");
        double height = input.nextDouble();
        
        Human humanbeing3 = new Human(name, age, gender, weight, height);
        humanbeing3.calcularPesoIdeal();
        humanbeing3.IMC();
        input.nextLine();
        input.close();
    }
}
