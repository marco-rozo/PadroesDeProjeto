package br.utfpr.gof.builderdocto;

public class ConstrutoraDocComum extends Construtora {
    
    @Override
    public void construirTitulo(Documento doc) {
        resultado = doc.getTitulo()+ "\n";
    }
    
    @Override
    public void construirAutor(Documento doc) {
        resultado += doc.getAutor()+ "\n";
    }
    
    @Override
    public void construirConteudo(Documento doc) {
        resultado += doc.getConteudo()+ "\n";
    }
    
}
