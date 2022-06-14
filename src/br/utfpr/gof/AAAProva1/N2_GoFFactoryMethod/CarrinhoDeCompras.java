package br.utfpr.gof.AAAProva1.N2_GoFFactoryMethod;

public abstract class CarrinhoDeCompras {
    protected Entrega entrega;

    public CarrinhoDeCompras(Entrega entrega){
        this.entrega = entrega;
    }
    public void consultarEntrega(){
        entrega.calcular();
    }
}
