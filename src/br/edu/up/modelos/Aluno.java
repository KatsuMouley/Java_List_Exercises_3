package br.edu.up.modelos;

public class Aluno {
    private String name;
    private double[] nota = new double[3];
    private double media;
    
    public Aluno(){}
    
    public Aluno(String name){
        this.name = name;
    }
    public Aluno( double[] nota){
        this.nota = nota;
    }
    public Aluno(String name, double[] nota){
        this.name = name;
        this.nota = nota;
    }

    public void media(){
        for (int i = 0; i < nota.length ; i++) {
        media += nota[i];   
        }
        media = media / 3;
        System.out.println("A média de notas do aluno "+ name + " é igual a " + media);
    }
    
    public void mediaResult(){
        for (int i = 0; i < nota.length ; i++) {
        media += nota[i];   
        }
        media = media / 3;
        System.out.printf("A média de notas do aluno %s é = %.1f", name, media);
        if (media<=5) {
            System.out.println("O aluno foi reprovado");
        } else if(media>=6){
            System.out.println("O aluno foi aprovado");
        } else{
            System.out.println("O aluno está em recuperação");
        }
    }
}
