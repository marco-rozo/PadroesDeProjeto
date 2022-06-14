package br.utfpr.gof.strategy.depois;

public class SalarioPorHora implements Salario{
    @Override
    public void calcularSalario() {
        System.out.println("Salário por hora");
    }
}
