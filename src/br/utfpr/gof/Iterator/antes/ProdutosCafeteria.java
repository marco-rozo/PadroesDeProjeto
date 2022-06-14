package br.utfpr.gof.Iterator.antes;

public class ProdutosCafeteria {
    static  final  int MAX_PRODUTOS = 5;
    int index = 0;
    Produto[] lanches;

    public ProdutosCafeteria(){
        lanches =  new Produto[MAX_PRODUTOS];
        addProduto("Café", 0.50);
        addProduto("Empada", 0.50);
        addProduto("Pastel", 0.50);
        addProduto("Bolo", 0.50);
        addProduto("Coquinha gelada", 0.50);
    }

    public void addProduto(String descricao, double preco) {
        Produto produto = new Produto(descricao, preco);
        if (index < MAX_PRODUTOS){
            lanches[index]=produto;
            index++;
        }
    }

    public Produto[] getProduto(){
        return  lanches;
    }
}
