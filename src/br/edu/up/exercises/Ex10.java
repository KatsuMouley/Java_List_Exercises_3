package br.edu.up.exercises;
import java.util.Scanner;
import br.edu.up.modelos.Idade;

public class Ex10 {
    public static void run(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Please enter the quantity of persons that will get their ages");
        int peopleQuantity = enter.nextInt();
        int age[] = new int[peopleQuantity];
        
        Idade[] ages = new Idade[peopleQuantity];
        for (int i = 0; i < peopleQuantity; i++) {
            System.out.println("Insert an age");
            age[i] = enter.nextInt();
            ages[i] = new Idade(age[i]);
        }

        for (int i = 0; i < peopleQuantity; i++) {
            System.out.println("The person number "+(i+1)+" is "+ages[i].getIdade()+" years old");
            if (ages[i].getIdade() > 17) {
                System.out.println("Essa pessoas é maior de idade");
            } else{
                System.out.println("Essa pessoas é menor de idade");
            }
        }
        enter.close();
    }
}
