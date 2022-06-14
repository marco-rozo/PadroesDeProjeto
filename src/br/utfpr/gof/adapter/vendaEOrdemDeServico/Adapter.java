package br.utfpr.gof.adapter.vendaEOrdemDeServico;

public class Adapter implements Documento {
    //classe adaptadora, implementando interface para ter acesso aos métodos "padrões"

    //declara a classe Ordem (classe a ser adaptada para utilização dos métodos por meio da interface)
    Ordem ordem;

    //Inicia no construtor a classe ordem recebida por parâmetro
    public Adapter (Ordem ordem){
        this.ordem = ordem;
    }

    //implementa os métodos da interface acessando os métodos da classe ordem correspondentes
    @Override
    public void abreDocumento() {
        ordem.abreOS();
    }

    @Override
    public void vendeItem() {
        ordem.vendeServico();
    }

    @Override
    public void fazPagamento() {
        ordem.acertaOS();
    }

    @Override
    public void fechaDocumento() {
        ordem.fechaOS();
    }
}
