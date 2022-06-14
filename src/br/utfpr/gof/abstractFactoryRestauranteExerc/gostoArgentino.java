package br.utfpr.gof.abstractFactoryRestauranteExerc;

public class gostoArgentino implements RestauranteFactory {

    @Override
    public Sobremesa criaSobremesa() {
        return new SobremesaArgentina();
    }

    @Override
    public PratoFeito criaPratoFeito() {
        return new PratoFeitoArgentina();
    }
}
