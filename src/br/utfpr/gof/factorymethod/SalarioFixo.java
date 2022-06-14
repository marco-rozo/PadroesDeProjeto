
package br.utfpr.gof.factorymethod;


public class SalarioFixo implements Salario {
    
    @Override
    public void calcularSalario() {
        System.out.println("Salário Fixo");
        SingletonLog.getInstance().doLog("Cálculo de Salário Fixo");
    }
}
