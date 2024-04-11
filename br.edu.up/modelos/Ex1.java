package exercise1;
import java.util.Scanner;
public class Ex1{
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do aluno");
        String name = input.nextLine();
        double notas[] = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira a nota[%d] do aluno:", i + 1);
            notas[i] = input.nextDouble();
        }
        input.nextLine();
        Aluno aluno = new Aluno(name, notas[0] ,notas[1] ,notas[2]);
        aluno.media();
        input.close();
    }
}