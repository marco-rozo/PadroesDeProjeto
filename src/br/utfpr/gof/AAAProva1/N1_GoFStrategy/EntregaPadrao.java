package br.utfpr.gof.AAAProva1.N1_GoFStrategy;

public class EntregaPadrao implements Entrega{

    @Override
    public void calcular() {
        System.out.println("EntregaPadrao: Entrega acrescida de frete calculado com base no envio pelos Correios via PAC.");
    }
}
