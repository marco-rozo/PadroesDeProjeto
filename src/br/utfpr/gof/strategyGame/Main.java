package br.utfpr.gof.strategyGame;

public class Main {

    public static void main(String[] args){
        System.out.println("Dragão verde avistado à frente!");

        //define a classe a ser utilizada
        ExterminadorDeDragoes exterminador = new ExterminadorDeDragoes(new EstrategiaArmaBranca());

        //executa o método da classe iniciada
        exterminador.iniciarBatalha();

        System.out.println("Dragão vermelho emerge");

        //altera a classe que vai implementar
        exterminador.mudaEstrategia(new EstrategiaDeProjetil());
        //executa o método da nova classe
        exterminador.iniciarBatalha();

        System.out.println("Dragão negro chega mais");
        //altera novamente a classe que vai implementar
        exterminador.mudaEstrategia(new EstrategiaDeFeitico());
        //executa novamente o método da nova classe
        exterminador.iniciarBatalha();

    }
}
