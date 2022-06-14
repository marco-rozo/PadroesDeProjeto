package br.utfpr.gof.AAAProva1.N2_GoFFactoryMethod;


public abstract class CompraFactory { //classe abstrata a ser utilizada
    protected abstract CarrinhoDeCompras create(String typeCompra);
}
