
package br.utfpr.gof.factorymethod;



public class Estagiario extends Funcionario {
    
    public Estagiario() {
        salario = new SalarioPorHora();
        ferias = new ComFerias();
    }
}
