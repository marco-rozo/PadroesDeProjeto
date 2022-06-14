package br.utfpr.gof.builderdocto;

public class ConstrutoraDocHtml extends Construtora {
    
    @Override
    public void construirTitulo(Documento doc) {
        resultado = "<html><head><title>" + doc.getTitulo()+ "</title>"
                +"<meta charset='UTF-8'>"
                +"<meta charset='viewport' content = 'with=device-width, "
                + "initial-scale=1.0'>"
                + "</head><body><div align='center'><p><font size='5'>"
                +"<strong>"+doc.getTitulo() + "</strong></font><br>";
    }
    
    @Override
    public void construirAutor(Documento doc) {
        resultado += "<strong>Autor: "+doc.getAutor()+ "<br>";
    }
    
    @Override
    public void construirConteudo(Documento doc) {
        resultado += doc.getConteudo()+ "</strong></p></div></body></html>";
    }
    
}
