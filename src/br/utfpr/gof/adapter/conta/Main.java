package br.utfpr.gof.adapter.conta;

public class Main {

    public static void main(String[] args) {
        //Instancia as classes
        Conta cs =  new ContaSalario();
        Conta cc =  new ContaCorrente();
        //Instancia a poupança por meio do adapter
        Conta cp =  new PoupancaAdapter(new ContaPoupanca()); //usando a conta Poupança por meio do Adapter
        cs.getSaldo();
        cc.getSaldo();
        //assim tendo acesso ao getSaldo (que acessa o poupança.valorAcumulado) para imprimir o valor
        cp.getSaldo(); //getSaldo acessado por meio do Adapter criado
    }
}
