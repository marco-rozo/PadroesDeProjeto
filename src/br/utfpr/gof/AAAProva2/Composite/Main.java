package br.utfpr.gof.AAAProva2.Composite;

public class Main {
    public static void main(String[] args) {
        //Padrão de Projeto GoF Iterator
        Relatorio relatorio = new Relatorio();
        System.out.println("------------COMPOSITE----------------");
        relatorio.imprimeSubsalas(new PastaSubpastas().createIterator());
        
    }
}
