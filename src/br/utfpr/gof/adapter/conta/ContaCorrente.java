package br.utfpr.gof.adapter.conta;

public class ContaCorrente implements Conta{

    @Override
    public void getSaldo() {
        System.out.println("Valor da conta corrente");
    }
}
