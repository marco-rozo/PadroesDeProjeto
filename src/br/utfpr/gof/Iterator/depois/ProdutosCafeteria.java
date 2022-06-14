
package br.utfpr.gof.Iterator.depois;



public class ProdutosCafeteria {
    static final int MAX_PRODUTOS = 5;
    int index = 0;
    Produto[] lanches;
    
    public ProdutosCafeteria() {
        lanches = new Produto[MAX_PRODUTOS];
        addProduto("Café", 0.50);
        addProduto("Bauru", 4.50);
        addProduto("Pão de Queijo", 2.50);
        addProduto("Pastel", 3.00);
        addProduto("Bolo", 12.00);
    }
    
    public void addProduto(String descricao, double preco) {
        Produto produto = new Produto(descricao, preco);
        if (index < MAX_PRODUTOS) {
            lanches[index] = produto;
            index++;
        }
    }
    
    public Produto[] getProdutos() {
        return lanches;
    }
    
    public Iterator createIterator() {
        return new CafeteriaIterator(lanches);
    }
}
