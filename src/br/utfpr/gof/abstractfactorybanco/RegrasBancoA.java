
package br.utfpr.gof.abstractfactorybanco;


public class RegrasBancoA implements RegrasFactory {
    
    @Override
    public CalculoJuros criaJuros() {
        return new CalculoJurosBancoA();
    }
    
    @Override
    public CalculoDescontos criaDescontos() {
        return new CalculoDescontosBancoA();
    }
    
    @Override
    public CalculoMultas criaMultas() {
        return new CalculoMultasBancoA();
    }
}
