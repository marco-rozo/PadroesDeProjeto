
package br.utfpr.gof.abstractfactorybanco;


public class CalculoJurosBancoB  implements CalculoJuros {
    
    @Override
    public void exibirInfoJuros() {
        System.out.println("Juros Banco B: 5% ao ano.");
    }
}