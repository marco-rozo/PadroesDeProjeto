package br.utfpr.gof.factoryMethodCoffe;

//classe concreta extendendo a classe abstrata
//implementando e sobrescrevendo seus métodos
public class CoffeFactoryConcrete extends CoffeFactory {

    @Override
    public Coffe createCoffe(String typeCoffe) {
        if (typeCoffe.equals("MOCHA")) {
            return new Mocha();
        } else if (typeCoffe.equals("CAPPUCCINO")) {
            return new Cappuccino();
        } else if (typeCoffe.equals("CAIPIRINHA")) {
            return new CoffeCaipirinha();
        } else {
            return null;
        }        
    }
}
