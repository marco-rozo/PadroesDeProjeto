
package br.utfpr.gof.abstractfactorybanco;


public class Main {
    public static void main(String[] args) {
        RegrasFactory regras = new RegrasBancoA();
        CalculoJuros juros = regras.criaJuros();
        CalculoDescontos descontos = regras.criaDescontos();
        CalculoMultas multas = regras.criaMultas();
        
        juros.exibirInfoJuros();
        descontos.exibirInfoDescontos();
        multas.exibirInfoMultas();
        
        regras = new RegrasBancoB();
        juros = regras.criaJuros();
        descontos = regras.criaDescontos();
        multas = regras.criaMultas();
        
        juros.exibirInfoJuros();
        descontos.exibirInfoDescontos();
        multas.exibirInfoMultas();
    }
}
