
package br.utfpr.gof.composite;

public class Main {
    public static void main(String[] args) {
        //Padrão de Projeto GoF Iterator
        Relatorio relatorio = new Relatorio();
//        System.out.println("------------ITERATOR----------------");
//        relatorio.imprimeProdutos(new ProdutosSupermercado().createIterator(),
//                "PRODUTOS SUPERMERCADO");
//        relatorio.imprimeProdutos(new ProdutosCafeteria().createIterator(),
//                "PRODUTOS CAFETERIA");
//        relatorio.imprimeProdutos(new ProdutosConsumo().createIterator(),
//                "PRODUTOS CONSUMO");
        System.out.println("------------COMPOSITE----------------");
        relatorio.imprimeSetoresSupermecado(new ProdutosSupermercado().createIterator());
        
    }
}
