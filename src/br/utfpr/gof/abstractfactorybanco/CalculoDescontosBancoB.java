
package br.utfpr.gof.abstractfactorybanco;


public class CalculoDescontosBancoB implements CalculoDescontos {
    
    @Override
    public void exibirInfoDescontos() {
        System.out.println("Descontos Banco B: 9% a vista.");
    }
}
