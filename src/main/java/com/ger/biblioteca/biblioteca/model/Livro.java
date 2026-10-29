package com.ger.biblioteca.biblioteca.model;

public class Livro {
    private String livro;
    private String autor;
    private String isbn;

    public Livro(String livro, String autor, String isbn) {
        this.livro = livro;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}