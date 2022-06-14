package br.utfpr.gof.observersupermercado;
import java.util.ArrayList;

public class ProdutosConsumo {

private ArrayList<Produto> consumosList;
    
    public ProdutosConsumo() {
        consumosList = new ArrayList<Produto>();
        addProduto("Detergente", 0.50, "Limpeza");
        addProduto("Vassoura", 1.00,  "Limpeza");
    }
    
    public void addProduto(String descricao, double preco, String setor) {
        Produto produto = new Produto(descricao, preco, setor);
        consumosList.add(produto);
    }
    
    public ArrayList<Produto> getProdutos() {
        return consumosList;
    }
    
    public Iterator createIterator() {
        return new ConsumoIterator(consumosList);
    }    
}
