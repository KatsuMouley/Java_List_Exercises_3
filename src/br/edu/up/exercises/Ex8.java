package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;

public class Ex8{
    public static void run(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Insira o nome do aluno");
        String name = enter.nextLine();
        double nota[] = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira a nota[%d] do aluno:", i + 1);
            nota[i] = enter.nextDouble();
        }
        enter.nextLine();
        Aluno aluno = new Aluno(name, nota);
        aluno.mediaResult();
        enter.close();
    }
}