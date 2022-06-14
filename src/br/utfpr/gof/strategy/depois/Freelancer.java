package br.utfpr.gof.strategy.depois;

public class Freelancer extends Funcionario {
    public Freelancer(){
        salario =  new SalarioPorComissão();
        ferias = new DireitoFeriasFalse();
    }
}
