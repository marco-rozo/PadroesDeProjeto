package br.utfpr.gof.adapter.vendaEOrdemDeServico;

public class Main {

    public static void main(String[] args) {
        //instancia as classes
        Documento venda =  new Venda();

        //instancia a classe por meio do adapter
        Documento ordem =  new Adapter(new Ordem()); //usando Ordem por meio do Adapter
        //faz acesso aos métodos
        venda.abreDocumento();
        //faz acesso aos métodos por meio do adapter (adapter referenciando os métodos da ordem)
        ordem.abreDocumento(); //abreDocumento acessado por meio do Adapter criado
    }
}
