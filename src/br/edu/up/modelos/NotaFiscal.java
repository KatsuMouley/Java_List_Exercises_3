package br.edu.up.modelos;

public class NotaFiscal {
    private int horas, type;
    public NotaFiscal(int type, int horas){
        this.type =type;
        this.horas = horas;
    }
    public double conta(){
        if (type == 1) {
            return horas * 0.6;
        } else if (type == 2) {
            return horas * 0.48;
        } else if (type == 3) {
            return horas * 1.29;
        } else {
            System.out.println("Tipo do cliente inválido");
            return 0;}
    }
}
