
package br.utfpr.gof.observersupermercado;
public class ConcreteObserverEstoqueAtual implements Observer, DisplayElement {
    private float qtdEstoque;
    private Produto produto;
    private Subject estoque;
    
    public ConcreteObserverEstoqueAtual(Subject estoque) {
        this.estoque = estoque;
        estoque.registerObserver(this);
    }
    
    @Override
    public void update(Produto produto, float qtdEstoque) {
        this.produto = produto;
        this.qtdEstoque = qtdEstoque;
        display();
    }
    
    @Override
    public void display() {
        System.out.println("Estoque atual do produto "+produto.getDescricao() +
                ": "+qtdEstoque);
        if (qtdEstoque <= 2) { //Considerando que 2 seja a quantidade mínima
            System.out.println("Gerar requisição de compra para o produto "+
                    produto.getDescricao());
        }
    }
    
}
