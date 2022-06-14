
package br.utfpr.gof.abstractfactorybanco;


public class CalculoMultasBancoA implements CalculoMultas {
    
    @Override
    public void exibirInfoMultas() {
        System.out.println("Multas Banco A: 2% ao dia.");
    }
}
