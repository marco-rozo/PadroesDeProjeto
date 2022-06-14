package br.utfpr.gof.AAAProva1.N1_GoFStrategy;

public class ComprasContextoB extends CarrinhoDeCompras {
    public ComprasContextoB(EntregaRetiradaLoja entrega) {
        super(entrega);
        entrega = new EntregaRetiradaLoja();
    }
}