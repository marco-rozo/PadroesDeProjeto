package br.utfpr.gof.strategy.depois;

public class Freelancer extends Funcionario {
    public Freelancer(){
        salario =  new SalarioPorComiss√£o();
        ferias = new DireitoFeriasFalse();
    }
}
