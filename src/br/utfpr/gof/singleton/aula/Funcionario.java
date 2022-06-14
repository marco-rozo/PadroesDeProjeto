package br.utfpr.gof.singleton.aula;

public abstract class Funcionario {
    protected Salario salario;
    protected Ferias ferias;

    public void calcularSalario(){
        salario.calcularSalario();
    }

    public void calcularFerias(){
        ferias.calcularFerias();
    }
}
