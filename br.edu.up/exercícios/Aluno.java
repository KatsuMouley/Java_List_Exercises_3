package exercise1;
public class Aluno {
    String name;
    double notas[] = new double[3];
    int media;
    
    public Aluno(){}
    public Aluno(String nameP){
        this.name = nameP;
    }
    public Aluno( double notasP1, double notasP2, double notasP3){
        this.notas[0] = notasP1;
        this.notas[1] = notasP2;
        this.notas[2] = notasP3;
    }
    public Aluno(String nameP, double notasP1, double notasP2, double notasP3){
        this.name = nameP;
        this.notas[0] = notasP1;
        this.notas[1] = notasP2;
        this.notas[2] = notasP3;
    }
    public void media(){
        for (int i = 0; i < notas.length ; i++) {
        media += notas[i];   
        }
        media = media / 3;
        System.out.println("A média de notas do aluno "+ name + " é igual a " + media);
    }
}
