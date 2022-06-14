package br.utfpr.gof.strategy.depois;

public class HomeOffice extends Funcionario {
   public HomeOffice(){
       salario =  new SalarioFixo();
       ferias = new DireitoFeriasTrue();
   }
}
