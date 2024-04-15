package br.edu.up.modelos;

public class Aluno {
    private String name;
    private double[] nota = new double[3];
    private int media;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] notas) {
        this.nota = notas;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public void media(){
        for (int i = 0; i < nota.length ; i++) {
        media += nota[i];   
        }
        media = media / 3;
        System.out.println("A média de notas do aluno "+ name + " é igual a " + media);
    }
}
