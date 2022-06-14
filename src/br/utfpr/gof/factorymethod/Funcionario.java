
package br.utfpr.gof.factorymethod;



public abstract class Funcionario {
    //atributos e métodos da classe Funcionário
    //...
    protected Salario salario;
    protected Ferias ferias;
    
    public void calcularSalario() {
        salario.calcularSalario();
    }
    
    public void calcularFerias() {
        ferias.calcularFerias();
    }

}
