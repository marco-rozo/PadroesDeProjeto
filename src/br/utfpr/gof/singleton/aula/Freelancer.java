package br.utfpr.gof.singleton.aula;

public class Freelancer extends Funcionario {
    public Freelancer(){
        salario =  new SalarioPorComissão();
        ferias = new DireitoFeriasFalse();
    }
}
