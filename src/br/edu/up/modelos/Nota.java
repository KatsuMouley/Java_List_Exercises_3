package br.edu.up.modelos;

public class Nota {
    private double notaLabo, exameFin, avaliaSemes, media;
    private char classificacao;

    public double getNotaLabo() {
        return notaLabo;
    }

    public double getExameFin() {
        return exameFin;
    }

    public double getAvaliaSemes() {
        return avaliaSemes;
    }

    public double getMedia() {
        return media;
    }

    public char getClassificacao() {
        return classificacao;
    }
    
    public Nota(double notaLabo, double avaliaSemes, double exameFin){
        this.notaLabo = notaLabo;
        this.exameFin = exameFin;
        this.avaliaSemes = avaliaSemes;
    }

    public double media1(){
        double media = ((notaLabo*2+exameFin*3+avaliaSemes*5))/(2+3+5);
        return media;
    }

    public void media2(){
        media = ((notaLabo*2+exameFin*3+avaliaSemes*5))/(2+3+5);
        if (media >= 8.1) {
            classificacao = 'A';
        } else if (media >= 7.8) {
            classificacao = 'B';
        } else if (media >= 6.7) {
            classificacao = 'C';
        } else if (media >= 5.6) {
            classificacao = 'D';
        } else {
            classificacao = 'R';
        }
    }
}
