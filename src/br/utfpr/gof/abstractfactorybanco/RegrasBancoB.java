
package br.utfpr.gof.abstractfactorybanco;


public class RegrasBancoB implements RegrasFactory {
    
    @Override
    public CalculoJuros criaJuros() {
        return new CalculoJurosBancoB();
    }
    
    @Override
    public CalculoDescontos criaDescontos() {
        return new CalculoDescontosBancoB();
    }
    
    @Override
    public CalculoMultas criaMultas() {
        return new CalculoMultasBancoB();
    }
}
