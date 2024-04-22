package br.edu.up.exercises;
import br.edu.up.modelos.*;

import java.util.Scanner;
import java.util.Random;//estou utilizando random para poupar o usuário de realizar inputs desnecessários

public class Ex16 {
    public static void run() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Funcionarios[] funcionarios = new Funcionarios[5]; // 584 funcionários é demais, por isso simplificamos para apenas 5
        
        for (int i = 0; i < funcionarios.length; i++) {
            double salario = rand.nextDouble() * 30000 + 1500;
            funcionarios[i] = new Funcionarios(salario);
        }
        
        char opt;
        System.out.println("Você quer ver os salários SEM o reajuste? (Salário minimo de 1500)");
        System.out.println("(a) mostrar todos\n(b) ver apenas o primeiro\n(c) não mostrar");
        opt = input.next().charAt(0);
        if (opt == 'a' || opt == 'A') {
            for (int i = 0; i < funcionarios.length; i++) {
                System.out.println("Funcionário [" + (i + 1) + "]");
                funcionarios[i].showsalarium();
            }
        } else if (opt == 'b' || opt == 'B') {
            System.out.println("Funcionário [" + 1 + "]");
            funcionarios[0].showsalarium();
        }
        
        // Aplicação do reajuste
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].reajuste();
        }
        
        System.out.println("Você quer ver os salários COM o reajuste?");
        System.out.println("(a) mostrar todos\n(b) ver apenas o primeiro\n(c) não mostrar");
        opt = input.next().charAt(0);
        if (opt == 'a' || opt == 'A') {
            for (int i = 0; i < funcionarios.length; i++) {
                System.out.println("Funcionário [" + (i + 1) + "]");
                funcionarios[i].showsalarium();
            }
        } else if (opt == 'b' || opt == 'B') {
            System.out.println("Funcionário [" + 1 + "]");
            funcionarios[0].showsalarium();
        }
        
        input.close();
    }

}

