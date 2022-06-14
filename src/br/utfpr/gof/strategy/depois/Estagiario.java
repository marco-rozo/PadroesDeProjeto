package br.utfpr.gof.strategy.depois;

public class Estagiario extends Funcionario {
    public Estagiario(){
        salario =  new SalarioPorHora();
        ferias = new DireitoFeriasTrue();
    }
}