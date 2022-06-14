package br.utfpr.gof.abstractFactoryRestauranteExerc;

public interface RestauranteFactory {
    Sobremesa criaSobremesa();
    PratoFeito criaPratoFeito();
}
