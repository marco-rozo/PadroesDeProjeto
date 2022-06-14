
package br.utfpr.gof.factorymethod;


public class SalarioComissao implements Salario {

    @Override
    public void calcularSalario() {
        System.out.println("Salario por Comissão");
        SingletonLog.getInstance().doLog("Cálculo de Salário por Comissão");
    }
}

