package br.utfpr.gof.singleton.aula;

public class Freelancer extends Funcionario {
    public Freelancer(){
        salario =  new SalarioPorComiss√£o();
        ferias = new DireitoFeriasFalse();
    }
}
