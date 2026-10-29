package com.ger.biblioteca.biblioteca.model;

public class Autor {
    private String nome;
    private String nacionalidade;
    private int qtdLivrosPublicados;

    public Autor(String nome, String nacionalidade, int qtdLivrosPublicados) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.qtdLivrosPublicados = qtdLivrosPublicados;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getQtdLivrosPublicados() {
        return qtdLivrosPublicados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setQtdLivrosPublicados(int qtdLivrosPublicados) {
        this.qtdLivrosPublicados = qtdLivrosPublicados;
    }
}
