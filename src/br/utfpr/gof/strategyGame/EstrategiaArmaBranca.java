package br.utfpr.gof.strategyGame;

public class EstrategiaArmaBranca implements AcaoDeEsterminio{
    //classe implementando a interface e sobrescrevendo o método como quiser
    @Override
    public void executar() {
        System.out.println("Com sua Excalibur você corta a cabeça do dragão!");
    }
}
