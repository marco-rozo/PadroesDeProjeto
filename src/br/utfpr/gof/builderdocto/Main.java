package br.utfpr.gof.builderdocto;

/**
 *
 * A Main se comporta como Diretora, invocando os métodos do builder para 
 * compor o objeto complexo
 */
public class Main {
    
    protected static void construir(Construtora constru, Documento doc) {
        //Método construir, é responsável por chamar os métodos que compõe
        //as partes do objeto
        constru.construirTitulo(doc);
        constru.construirAutor(doc);
        constru.construirConteudo(doc);
    }
    
    public static void main(String[] args) {
        //Instancia os dois tipos de construtora
        Construtora constDocComum = new ConstrutoraDocComum();
        Construtora constDocHtml = new ConstrutoraDocHtml();
        //Inicializa o objeto complexo, passando suas partes como parâmetro
        Documento doc = new Documento("Padrão Builder", "PP24S", 
                "Conteúdo do documento");
        
        //Constrói o documento comum
        construir(constDocComum, doc);
        
        //Constrói o documento Html
        construir(constDocHtml, doc);
        
        //Exibe os resultados obtidos com as duas formatações
        System.out.println(constDocComum.obterResultado());
        System.out.println(constDocHtml.obterResultado());
        
    }
}
