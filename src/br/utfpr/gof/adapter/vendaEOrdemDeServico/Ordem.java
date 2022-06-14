package br.utfpr.gof.adapter.vendaEOrdemDeServico;

public class Ordem {
    //métodos a serem acessados por meio da classe adaptadora para adaptar a interface usada
    public void abreOS() {
        System.out.println("Abre OS ordem...");
    }
    public void vendeServico() {
        System.out.println("Vende servico ordem...");
    }
    public void acertaOS() {
        System.out.println("Acerta OS ordem...");
    }
    public void fechaOS() {
        System.out.println("Fecha OS ordem...");
    }
}
