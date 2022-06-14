
package br.utfpr.gof.abstractFactoryRestauranteExerc;

public class SobremesaArgentina implements Sobremesa {

    @Override
    public void ingredientesSobremesa() {
        System.out.println("Ingrediente sobremesa brasileira - Flan de doce de leite:");
        System.out.println("Doce de Leite\n" +
                "Leite integral\n" +
                "Baunilha\n" +
                "Gemas de ovo");
    }
}
