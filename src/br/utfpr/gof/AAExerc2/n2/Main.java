package br.utfpr.gof.AAExerc2.n2;

public class Main {
    public static void main(String[] args) {
        //Padrão de Projeto GoF Iterator
        Relatorio relatorio = new Relatorio();
        System.out.println("------------ITERATOR----------------");
        relatorio.imprime(new SalasSubsalas().createIterator(),
                "SALAS");
        System.out.println("------------COMPOSITE----------------");
        relatorio.imprimeSubsalas(new SalasSubsalas().createIterator());
        
    }
}
