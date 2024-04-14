import br.edu.up.exercises.*;
import java.util.Scanner;
    
public class Programa{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        System.out.printf("Escolha uma atividade para executar\n(1 - 26)\nInput:");
        int value = input.nextInt();
        input.nextLine();

        switch (value) {
            case 1:
                Ex1.run();                    
                break;
            default:
                break;
        }
        
        input.close();
    }
}
