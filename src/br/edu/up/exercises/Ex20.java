package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex20{
    public static void run(){
        Scanner input = new Scanner(System.in);
        int level;
        do{
        System.out.println("Qual o nível do professor? (1) (2) (3)");
        level = input.nextInt();
        }while(level != 1 && level != 2 && level != 3);
        System.out.println("Quantas horas o professor deu aula?");
        int horas = input.nextInt();
        Professor prof = new Professor(level, horas);
        System.out.println("O professor receberá "+prof.pagamento()+" R$ de pagamento por "+prof.getHoras()+" horas de aula");
        input.nextLine();
        input.close();
    }
}