package br.utfpr.gof.builderdocto;

/**
 *
 * Documento, que é o objeto complexo que será construído com variações de 
 * implementação de métodos para impressão de título, autor e conteúdo
 */

public class Documento {
    private String titulo;
    private String autor;
    private String conteudo;

    public Documento(String titulo, String autor, String conteudo) {
        this.titulo = titulo;
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    
}
