
package br.utfpr.gof.factorymethod;


public class Voluntario extends Funcionario{
    
    public Voluntario() {
       salario = new SemSalario();
       ferias = new SemFerias();
    }
}

