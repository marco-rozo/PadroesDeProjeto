package br.utfpr.gof.strategy.depois;

public class SalarioZerado implements Salario{
    @Override
    public void calcularSalario() {
        System.out.println("Não recebe salário");
    }
}
