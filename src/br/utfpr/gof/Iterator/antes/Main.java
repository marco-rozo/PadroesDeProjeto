package br.utfpr.gof.Iterator.antes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProdutosSupermercaos produtosList = new ProdutosSupermercaos();
        ArrayList<Produto> produtos = produtosList.getProdutos();

        ProdutosCafeteria lanchesList = new ProdutosCafeteria();
        Produto[] lanches = lanchesList.getProduto();

        System.out.println("---------PRODUTOS MERCADO----------");
        for (int i = 0; i < produtos.size(); i++){
            Produto produto = (Produto) produtos.get(i);
            System.out.println(produto.getDescription() + ", ");
            System.out.println(produto.getPrice());
        }

        System.out.println("---------PRODUTOS CAFETERIA----------");
        for (int i = 0; i < lanches.length; i++){
            Produto lanche = lanches[i];
            if (lanche != null){
                System.out.println(lanche.getDescription() + ", ");
                System.out.println(lanche.getPrice());
            }
        }
    }
}
