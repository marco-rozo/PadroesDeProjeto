package br.utfpr.gof.observersupermercado;
import java.util.ArrayList;

public class ProdutosSupermercado {
    private ArrayList<Produto> produtosList;
    
    public ProdutosSupermercado() {
        produtosList = new ArrayList<Produto>();
        addProduto("Alface", 5.50, "Verduras");
        addProduto("Agrião", 4.00, "Verduras");
        addProduto("Laranja", 6.00, "Frutas");
        addProduto("Maçã", 8.99, "Frutas");
        addProduto("Tomate", 12.00, "Organicas");
    }
    
    public void addProduto(String descricao, double preco, String setor) {
        Produto produto = new Produto(descricao, preco, setor);
        produtosList.add(produto);
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtosList;
    }
    
    public Iterator createIterator() {
        return new SupermercadoIterator(produtosList);
    }
}
