package br.utfpr.gof.Iterator.antes;

import java.util.ArrayList;

public class ProdutosSupermercaos {
    private ArrayList<Produto> produtosList;

    public  ProdutosSupermercaos(){
        produtosList = new ArrayList<Produto>();
        addProduto("Alface", 0.50);
        addProduto("Agrião", 4.00);
        addProduto("Laranja", 6.00);
        addProduto("Maça", 8.99);
        addProduto("Tomate", 12.00);
    }

    public void addProduto(String descricao, double preco) {
        Produto produto =  new Produto(descricao, preco);
        produtosList.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtosList;
    }
}
