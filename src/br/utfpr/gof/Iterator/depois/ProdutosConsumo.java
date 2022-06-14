
package br.utfpr.gof.Iterator.depois;

import java.util.ArrayList;


public class ProdutosConsumo {

private ArrayList<Produto> consumosList;
    
    public ProdutosConsumo() {
        consumosList = new ArrayList<Produto>();
        addProduto("Detergente", 0.50);
        addProduto("Vassoura", 1.00);
        addProduto("Laranja", 2.80);
        addProduto("Maçã", 2.50);
        addProduto("Tomate", 12.40);
    }
    
    public void addProduto(String descricao, double preco) {
        Produto produto = new Produto(descricao, preco);
        consumosList.add(produto);
    }
    
    public ArrayList<Produto> getProdutos() {
        return consumosList;
    }
    
    public Iterator createIterator() {
        return new ConsumoIterator(consumosList);
    }    
}
