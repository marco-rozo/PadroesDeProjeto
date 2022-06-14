package br.utfpr.gof.abstractFactoryRestauranteExerc;

public class PratoFeitoArgentina implements PratoFeito{
    @Override
    public void ingredientesPF() {
        System.out.println("Ingredientes Prato Feito Argentino:");
        System.out.println("Bife de Chorizo\n" +
                "Purê de batata\n" +
                "Salada");
    }
}
