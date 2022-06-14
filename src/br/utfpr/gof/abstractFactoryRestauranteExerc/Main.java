package br.utfpr.gof.abstractFactoryRestauranteExerc;

public class Main {
    public static void main(String[] args) {
        RestauranteFactory restaurante = new gostoBrasileiro();
        PratoFeito pf = restaurante.criaPratoFeito();
        Sobremesa sobremesa = restaurante.criaSobremesa();

        System.out.println("===============================");
        pf.ingredientesPF();
        System.out.println("===============================");
        sobremesa.ingredientesSobremesa();

        restaurante = new gostoArgentino();
        pf = restaurante.criaPratoFeito();
        sobremesa = restaurante.criaSobremesa();
        System.out.println("===============================");
        pf.ingredientesPF();
        System.out.println("===============================");
        sobremesa.ingredientesSobremesa();
    }
}
