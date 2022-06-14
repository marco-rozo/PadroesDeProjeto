package br.utfpr.gof.singleton.aula;

public class Contratado extends Funcionario {
   public Contratado(){
       salario =  new SalarioFixo();
       ferias = new DireitoFeriasTrue();
   }
}
