package br.edu.up.modelos;

public class Triangulo {
    private int A, B, C;
    public Triangulo(int A, int B, int C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public String tipo(){
        if ( A == B && B == C && A == C) {
            return "Equilátero & Isócele";
        } else 
        if ( A == B || B == C || A == C) {
            return "Isóscele";
        } else 
        if ( A != B && B != C && A != C) {
            return "Escaleno";
        } else{
            return "Nenhum";
        }
    }
}
