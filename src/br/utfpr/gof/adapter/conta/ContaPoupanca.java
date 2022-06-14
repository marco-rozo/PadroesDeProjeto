package br.utfpr.gof.adapter.conta;

public class ContaPoupanca{
    //nesse caso a poupança nao implementa a interface "Conta"
    //tendo assim um método próprio para resgatar o saldo (valorAcumulado)

    public void valorAcumulado(){
        System.out.println("Valor acumulado da poupança");
    }
}
