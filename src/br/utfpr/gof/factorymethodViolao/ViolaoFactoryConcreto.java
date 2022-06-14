
package br.utfpr.gof.factorymethodViolao;


public class ViolaoFactoryConcreto extends ViolaoFactory {

    @Override
    public Violao createViolao(String marca) {
        if (marca.equals("Giannini")) {
            return new Giannini();
        } else if (marca.equals("Eagle")) {
            return new Eagle();
        } else if (marca.equals("Tagima")) {
            return new Tagima();
        } else {
            return null;
        }        
    }
}
