package br.utfpr.gof.observersupermercado;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Padrão de Projeto GoF Iterator
        Relatorio relatorio = new Relatorio();
        System.out.println("------------ITERATOR----------------");
        relatorio.imprimeProdutos(new ProdutosSupermercado().createIterator(), 
                "PRODUTOS SUPERMERCADO");
        relatorio.imprimeProdutos(new ProdutosCafeteria().createIterator(), 
                "PRODUTOS CAFETERIA");
        relatorio.imprimeProdutos(new ProdutosConsumo().createIterator(), 
                "PRODUTOS CONSUMO");
        System.out.println("------------COMPOSITE----------------");
        relatorio.imprimeSetoresSupermecado(new ProdutosSupermercado().createIterator());
        
        System.out.println("------------OBSERVER----------------");
        //Sujeito observado
        ConcreteSubjectEstoque estoque = new ConcreteSubjectEstoque();
        ConcreteObserverEstoqueAtual atual = new ConcreteObserverEstoqueAtual(estoque);
        Produto prod = new Produto("Feijão", 4, "Alimentos");
        estoque.setEstoque(prod, 7);
        estoque.setEstoque(prod, 1);
    }
}
