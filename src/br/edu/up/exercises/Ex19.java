package br.edu.up.exercises;
import br.edu.up.modelos.*;
import java.util.Scanner;
public class Ex19{
    public static void run(){
        Scanner input = new Scanner(System.in);
        int[] side = new int[3];
        for (int i = 0; i < side.length; i++) {
            System.out.println("Insira o valor do lado "+(i+1)+" do triangulo");
            side[i] = input.nextInt();
        }
        if (side[0] < side[1] + side[2] && side[1] < side[0] + side[2] && side[2] < side[0] + side[1]) {
            Triangulo triangulo = new Triangulo(side[0], side[1], side[2]);
            System.out.println("O triangulo é "+triangulo.tipo());
        } else {
            System.out.println("A propriedade do triangulo não bate");
        }

        input.nextLine();
        input.close();
    }
}