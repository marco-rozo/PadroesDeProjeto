
package br.utfpr.gof.factorymethod;


public class SalarioPorHora implements Salario {

    @Override
    public void calcularSalario() {
        System.out.println("Salário por Hora");
        SingletonLog.getInstance().doLog("Cálculo de Salário por Hora");
    }    
}
