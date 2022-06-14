package br.utfpr.gof.AAAProva1.N2_GoFFactoryMethod;

public class ComprasContextoA extends CarrinhoDeCompras {
    public ComprasContextoA(EntregaPadrao entrega) {
        super(entrega);
        entrega = new EntregaPadrao();
    }
}