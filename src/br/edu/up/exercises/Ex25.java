package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex25{
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do aluno");
        String name = input.nextLine();
        System.out.println("Insira a matricula do aluno");
        int matricula = input.nextInt();
        double notaLabo, avaliaSemes, exameFin;

        System.out.printf("Insira a nota  do aluno do laboratório:");
        notaLabo = input.nextDouble();
        System.out.printf("Insira a nota  do aluno da avaliação semestral:");
        avaliaSemes = input.nextDouble();
        System.out.printf("Insira a nota  do aluno do exame final:");
        exameFin = input.nextDouble();
        input.nextLine();
        Nota calcularNota = new Nota( notaLabo, avaliaSemes, exameFin);
        calcularNota.media2();;
        System.out.println("A nota ponderada do aluno "+name+" de matricula "+matricula+"; é de "+String.format("%.2f",calcularNota.getMedia())+" e sua classificação é: "+calcularNota.getClassificacao());
        input.close();
    }
}