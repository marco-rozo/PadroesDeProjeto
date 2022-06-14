package br.utfpr.gof.singleton.carrinho;

public class Main {

    public static void main(String[] args){
        CarrinhoDeComprasSingleton.getInstance().addItem("Feijão");
        CarrinhoDeComprasSingleton.getInstance().addItem("Arroz");
        CarrinhoDeComprasSingleton.getInstance().addItem("Batata");
    }
}
