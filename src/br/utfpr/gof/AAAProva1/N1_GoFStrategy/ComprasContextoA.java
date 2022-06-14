package br.utfpr.gof.AAAProva1.N1_GoFStrategy;

public class ComprasContextoA extends CarrinhoDeCompras {
    public ComprasContextoA(EntregaPadrao entrega) {
        super(entrega);
        entrega = new EntregaPadrao();
    }

}