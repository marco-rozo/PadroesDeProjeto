package br.utfpr.gof.abstractFactoryRestauranteExerc;

public class PratoFeitoBrasileiro implements PratoFeito{
    @Override
    public void ingredientesPF() {
        System.out.println("Ingredientes Prato Feito Brasileiro:");
        System.out.println("Arroz\n" +
                "Feijão\n" +
                "Bife\n" +
                "Ovo\n" +
                "Batata frita");
    }
}
