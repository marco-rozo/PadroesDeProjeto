package br.utfpr.gof.AAAProva1.N2_GoFFactoryMethod;

public class ComprasContextoB extends CarrinhoDeCompras {
    public ComprasContextoB(EntregaRetiradaLoja entrega) {
        super(entrega);
        entrega = new EntregaRetiradaLoja();
    }
}