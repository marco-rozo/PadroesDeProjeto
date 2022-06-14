package br.utfpr.gof.singleton.aula;

public class Estagiario extends Funcionario {
    public Estagiario(){
        salario =  new SalarioPorHora();
        ferias = new DireitoFeriasTrue();
    }
}