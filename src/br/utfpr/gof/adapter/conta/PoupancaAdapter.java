package br.utfpr.gof.adapter.conta;

public class PoupancaAdapter implements Conta{
    //o Adapter implementa a Conta para ter acesso ao método "getSaldo"

    //instancia a Poupanca (Classe a ser adaptada)
    ContaPoupanca poupanca;

    //Inicia no construtor a poupança recebida por parâmetro
    public PoupancaAdapter (ContaPoupanca poupanca){
        this.poupanca = poupanca;
    }

    @Override //escreve o metodo getSaldo acessando o método valorAcumulado da poupança
    public void getSaldo() {
        poupanca.valorAcumulado();
    }
}
