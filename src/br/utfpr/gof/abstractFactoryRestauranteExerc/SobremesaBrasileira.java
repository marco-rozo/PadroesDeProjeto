
package br.utfpr.gof.abstractFactoryRestauranteExerc;

public class SobremesaBrasileira implements Sobremesa {

    @Override
    public void ingredientesSobremesa() {
        System.out.println("Ingrediente sobremesa brasileira - Pudim de leite condensado:");
        System.out.println("Leite Condensado\n" +
                "Leite integral\n" +
                "Ovos");
    }
}
