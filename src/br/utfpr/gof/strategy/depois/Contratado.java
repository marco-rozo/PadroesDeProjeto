package br.utfpr.gof.strategy.depois;

public class Contratado extends Funcionario {
   public Contratado(){
       salario =  new SalarioFixo();
       ferias = new DireitoFeriasTrue();
   }
}
