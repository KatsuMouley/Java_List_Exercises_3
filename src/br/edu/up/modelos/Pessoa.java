package br.edu.up.modelos;

public class Pessoa {
    private int idade;//some int
    private String nome;//name. bad good
    private char sexo, saude;//f F m M
    
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public char getSaude() {
        return saude;
    }

    public Pessoa(int idade, String nome, char saude, char sexo){
        this.idade = idade;
        this.nome = nome;
        this.saude = saude;
        this.sexo = sexo;
    }
    
    public boolean alistamento(){
        if (idade > 17 && (saude == 'g' || saude == 'G')) {
            return true;   
        } else {
            return false;
        }
    }
}
