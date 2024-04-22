package br.edu.up.exercises;
import java.util.Scanner;
import br.edu.up.modelos.Nota;

public class Ex24{
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do aluno");
        String name = input.nextLine();
        double notaLabo, avaliaSemes, exameFin;

        System.out.printf("Insira a nota  do aluno do laboratório:");
        notaLabo = input.nextDouble();
        System.out.printf("Insira a nota  do aluno da avaliação semestral:");
        avaliaSemes = input.nextDouble();
        System.out.printf("Insira a nota  do aluno do exame final:");
        exameFin = input.nextDouble();
        input.nextLine();
        Nota calcularNota = new Nota(notaLabo, avaliaSemes, exameFin);
        
        System.out.println("A nota ponderada do aluno "+name+" é de "+String.format("%.2f",calcularNota.media()));
        input.close();
    }
}