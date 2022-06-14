package br.utfpr.gof.strategy.depois;

public class Voluntario extends Funcionario {
    public Voluntario(){
        salario =  new SalarioZerado();
        ferias = new DireitoFeriasFalse();
    }
}
