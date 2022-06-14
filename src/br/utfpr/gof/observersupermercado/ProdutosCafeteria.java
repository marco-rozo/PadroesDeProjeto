package br.utfpr.gof.observersupermercado;
public class ProdutosCafeteria {
    static final int MAX_PRODUTOS = 5;
    int index = 0;
    Produto[] lanches;
    
    public ProdutosCafeteria() {
        lanches = new Produto[MAX_PRODUTOS];
        addProduto("Café", 0.50, "Bebidas");
        addProduto("Bauru", 4.50, "Salgados");
        addProduto("Pão de Queijo", 2.50, "Salgados");
        addProduto("Pastel", 3.00, "Salgados");
        addProduto("Bolo", 12.00, "Doces");
    }
    
    public void addProduto(String descricao, double preco, String setor) {
        Produto produto = new Produto(descricao, preco, setor);
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
