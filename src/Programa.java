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
            case 2:
                Ex2.run();
                break;
            case 3:
                Ex3.run();
                break;
            case 4:
                Ex4.run(); 
                break;
            case 5:
                Ex5.run();
                break;
            case 6:
                Ex6.run(); 
                break;
            case 7:
                Ex7.run();
                break;
            case 8:
                Ex8.run(); 
                break;
            case 9:
                Ex9.run();
                break;
            case 10:
                Ex10.run();
                break;
            case 11:
                Ex11.run();
                break;
            case 12:
                Ex12.run();
                break;
            case 13:
                Ex13.run();
                break;
            case 14:
                Ex14.run();
                break;
            case 15:
                Ex15.run();
                break;
            case 16:
                Ex16.run();
                break;
            case 17:
                Ex17.run();
                break;
            case 18:
                Ex18.run();    
                break;
            // case 19:
            //     Ex19.run();
            //     break;
            // case 20:
            //     Ex20.run();                    
            //     break;
            // case 21:
            //     Ex21.run();    
            //     break;
            // case 22:
            //     Ex22.run();
            //     break;
            // case 23:
            //     Ex23.run();                    
            //     break;
            // case 24:
            //     Ex24.run();                    
            //     break;
            // case 25:
            //     Ex25.run();                    
            //     break;
            // case 26:
            //     Ex26.run();                    
            //     break;

            default:
                break;
    }
        
        input.close();
    }
}
