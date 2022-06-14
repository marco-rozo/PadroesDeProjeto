package br.utfpr.gof.abstractFactoryRestauranteExerc;

public class gostoBrasileiro implements RestauranteFactory {

    @Override
    public Sobremesa criaSobremesa() {
        return new SobremesaBrasileira();
    }

    @Override
    public PratoFeito criaPratoFeito() {
        return new PratoFeitoBrasileiro();
    }
}
