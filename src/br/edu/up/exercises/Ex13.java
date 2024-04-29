package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;

public class Ex13 {
    public static void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira quantas pessoas se alistaram para o serviço militar voluntário?");
        int peopleQuantity = input.nextInt();
        input.nextLine();
        Pessoa[] pessoas = new Pessoa[peopleQuantity];

        int[] idade = new int[peopleQuantity];
        String[] nome = new String[peopleQuantity];
        char[] sexo = new char[peopleQuantity], saude = new char[peopleQuantity];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Qual o nome da pessoa ["+(i+1)+"]");
            nome[i] = input.nextLine();
            System.out.println("Qual a idade da pessoa ["+(i+1)+"] , "+nome[i]);
            idade[i] = input.nextInt();
            System.out.println("Qual o estado da sáude da pessoa ["+(i+1)+"] (G)good (B)bad");
            saude[i] = input.next().charAt(0);
            System.out.println("Qual o sexo da pessoa ["+(i+1)+"] (M)Male (F)female");
            sexo[i] = input.next().charAt(0);
            input.nextLine();
            
            pessoas[i] = new Pessoa(idade[i], nome[i], saude[i], sexo[i]);
        }
        for (int i = 0; i < saude.length; i++) {
            //  System.out.println( pessoas[i].nome + " " + pessoas[i].idade + " " + pessoas[i].saude + " " + pessoas[i].sexo);
            if (pessoas[i].alistamento()) {
                System.out.println(pessoas[i].getNome()+" foi aprovado(a) para o serviço militar");   
            } else {
                System.out.println(pessoas[i].getNome()+" não foi aprovado(a) para o serviço militar");   
            }
        }
        input.close();
    }
} 
