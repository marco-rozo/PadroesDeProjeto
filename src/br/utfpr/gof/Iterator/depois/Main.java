
package br.utfpr.gof.Iterator.depois;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //Padrão de Projeto GoF Iterator
        Relatorio relatorio = new Relatorio();
        relatorio.imprimeProdutos(new ProdutosSupermercado().createIterator(), 
                "PRODUTOS SUPERMERCADO");
        relatorio.imprimeProdutos(new ProdutosCafeteria().createIterator(), 
                "PRODUTOS CAFETERIA");
        relatorio.imprimeProdutos(new ProdutosConsumo().createIterator(), 
                "PRODUTOS CONSUMO");
    }
}
