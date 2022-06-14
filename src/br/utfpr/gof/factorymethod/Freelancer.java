
package br.utfpr.gof.factorymethod;



public class Freelancer extends Funcionario{
    
    public Freelancer() {
       salario = new SalarioComissao();
       ferias = new SemFerias();
    }
}
