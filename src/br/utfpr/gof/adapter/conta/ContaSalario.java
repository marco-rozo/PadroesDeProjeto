package br.utfpr.gof.adapter.conta;

public class ContaSalario implements Conta{
    @Override
    public void getSaldo() {
        System.out.println("Saldo da conta salário...");
    }
}
