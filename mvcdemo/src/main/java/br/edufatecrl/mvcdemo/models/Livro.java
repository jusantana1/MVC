package br.edufatecrl.mvcdemo.models;

public class Livro {

    private String livro;
    private String autor;


    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String livro, String autor) {
        this.livro = livro;
        this.autor = autor;
    }
}
