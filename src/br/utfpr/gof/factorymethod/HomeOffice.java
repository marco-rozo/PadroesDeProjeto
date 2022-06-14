
package br.utfpr.gof.factorymethod;



public class HomeOffice extends Funcionario{
    
    public HomeOffice() {
       salario = new SalarioFixo();
       ferias = new ComFerias();
    }
}

