
package br.utfpr.gof.abstractfactorybanco;


public class CalculoJurosBancoA implements CalculoJuros {
    
    @Override
    public void exibirInfoJuros() {
        System.out.println("Juros Banco A: 8% ao ano.");
    }
}
