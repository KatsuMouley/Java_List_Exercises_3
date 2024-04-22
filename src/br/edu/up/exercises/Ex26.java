package br.edu.up.exercises;
import java.util.Scanner;
import br.edu.up.modelos.Seguradora;

public class Ex26 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do segurado:");
        String nome = input.nextLine();

        System.out.println("Informe a idade do segurado:");
        int idade = input.nextInt();

        System.out.println("Informe o grupo de risco do segurado.  Digite(baixo, medio ou alto):");
        String grupoRisco = input.next().toLowerCase();
        input.nextLine();
        Seguradora segurado = new Seguradora(nome, idade, grupoRisco);
        segurado.determinarCategoria(idade, grupoRisco);

        if (segurado.getCategoria() != -1) {
            System.out.println("\nNome: " + segurado.getNome());
            System.out.println("Idade: " + segurado.getIdade());
            System.out.println("Grupo de Risco: " + segurado.getGrupoRisco());
            System.out.println("Categoria de Seguro: " + segurado.getCategoria());
        } else {
            System.out.println("\nDesculpe, o segurado não se enquadra em nenhuma das categorias ofertadas.");
        }
        input.close();
    }
}
