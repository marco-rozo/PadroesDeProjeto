package br.utfpr.gof.strategy.antes;

public class Estagiario extends Funcionario{

    @Override
    public void calcularSalario() {
        System.out.println("Salário do contratado - Salário por hora");
    }
}