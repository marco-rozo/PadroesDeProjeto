package br.utfpr.gof.singleton.aula;

public class Voluntario extends Funcionario {
    public Voluntario(){
        salario =  new SalarioZerado();
        ferias = new DireitoFeriasFalse();
    }
}
