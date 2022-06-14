package br.utfpr.gof.builderdocto;

/**
 *
 * Classe Builder - possui a assinatura dos métodos de construção do objeto 
 * complexo (documento)
 */
public abstract class Construtora {
    protected String resultado;
    
    public abstract void construirTitulo(Documento doc);
    public abstract void construirAutor(Documento doc);
    public abstract void construirConteudo(Documento doc);
    
    //Método que exibe o resultado da construção, não necessitando especialização
    public String obterResultado() {
        return resultado;
    }
}
