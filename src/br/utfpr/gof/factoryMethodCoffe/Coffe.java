
package br.utfpr.gof.factoryMethodCoffe;

//Classe mãe
// com atributos protegidos
// a ser extendida por classes filhas
public class Coffe {
    protected double price;
    protected double caffeinePercentage
    ;

    public double getPrice() {
        return price;
    }
    public double getCaffeinePercentage() {
        return caffeinePercentage;
    }

}
