
package br.utfpr.gof.factoryMethodCoffe;

public abstract class CoffeFactory { //classe abstrato para ser extendido por outras classes e acessar seus
    //métodos de acordo com os parametros passados
    protected abstract Coffe createCoffe(String typeCoffe);
    
    public Coffe calculatePrice(String type) {
        Coffe coffe = createCoffe(type);
        return coffe;
    }
}
