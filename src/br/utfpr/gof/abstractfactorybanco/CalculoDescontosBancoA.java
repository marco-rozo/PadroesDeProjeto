
package br.utfpr.gof.abstractfactorybanco;


public class CalculoDescontosBancoA implements CalculoDescontos {
    
    @Override
    public void exibirInfoDescontos() {
        System.out.println("Descontos Banco A: 13% a vista.");
    }
}
