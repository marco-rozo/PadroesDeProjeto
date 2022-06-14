
package br.utfpr.gof.factorymethod;



public class Contratado extends Funcionario {
    
    public Contratado() {
        salario = new SalarioFixo();
        ferias = new ComFerias();
    }
}
