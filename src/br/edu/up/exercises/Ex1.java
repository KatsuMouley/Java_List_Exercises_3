package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;

public class Ex1 {
    public static void run() {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Insira o nome do aluno");
        String name = input.nextLine();
        
        double notas[] = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira a nota[%d] do aluno:", i + 1);
            notas[i] = input.nextDouble();
        }
        input.nextLine();
        aluno.media();
        input.close();
    }
}