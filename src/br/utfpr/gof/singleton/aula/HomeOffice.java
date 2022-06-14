package br.utfpr.gof.singleton.aula;

public class HomeOffice extends Funcionario {
   public HomeOffice(){
       salario =  new SalarioFixo();
       ferias = new DireitoFeriasTrue();
   }
}
