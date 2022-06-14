
package br.utfpr.gof.abstractfactorybanco;


public interface RegrasFactory {
    CalculoJuros criaJuros();
    CalculoDescontos criaDescontos();
    CalculoMultas criaMultas();
}
