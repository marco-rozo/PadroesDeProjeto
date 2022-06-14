package br.utfpr.gof.strategy.depois;

public class SalarioPorComissão implements Salario{
    @Override
    public void calcularSalario() {
        System.out.println("Salário por comissão");
    }
}
