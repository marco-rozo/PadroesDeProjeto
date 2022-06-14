package br.utfpr.gof.strategy.depois;

public class SalarioFixo implements Salario{
    @Override
    public void calcularSalario() {
        System.out.println("Salário fixo");
    }
}
