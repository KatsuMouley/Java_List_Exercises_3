package br.edu.up.modelos;

public class Seguradora {
    private int idade;
    private String grupoRisco, nome;
    private int categoria;
    
    public int getIdade() {
        return idade;
    }

    public String getGrupoRisco() {
        return grupoRisco;
    }

    public String getNome() {
        return nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public Seguradora(String nome, int idade, String grupoRisco){
        this.idade = idade;
        this.grupoRisco = grupoRisco;
        this.nome = nome;
    }
    
    public void determinarCategoria(int idade, String grupoRisco) {
        categoria = -1;

        if (idade >= 17 && idade <= 20) {
            categoria = getCategoriaBaseadaNoGrupoDeRisco(1, 2, 3, grupoRisco);
        } else if (idade >= 21 && idade <= 24) {
            categoria = getCategoriaBaseadaNoGrupoDeRisco(2, 3, 4, grupoRisco);
        } else if (idade >= 25 && idade <= 34) {
            categoria = getCategoriaBaseadaNoGrupoDeRisco(3, 4, 5, grupoRisco);
        } else if (idade >= 35 && idade <= 64) {
            categoria = getCategoriaBaseadaNoGrupoDeRisco(4, 5, 6, grupoRisco);
        } else if (idade >= 65 && idade <= 70) {
            categoria = getCategoriaBaseadaNoGrupoDeRisco(7, 8, 9, grupoRisco);
        }
    }

    public static int getCategoriaBaseadaNoGrupoDeRisco(int baixo, int medio, int alto, String grupoRisco) {
        int categoria;

        switch (grupoRisco) {
            case "baixo":
                categoria = baixo;
                break;
            case "medio":
                categoria = medio;
                break;
            case "alto":
                categoria = alto;
                break;
            default:
                categoria = -1;
        }
        return categoria;
    }
}
