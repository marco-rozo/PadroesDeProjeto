
package br.utfpr.gof.abstractfactorybanco;


public class CalculoMultasBancoB implements CalculoMultas {
    
    @Override
    public void exibirInfoMultas() {
        System.out.println("Multas Banco B: 4% ao dia.");
    }
}
