package br.utfpr.gof.strategyGame;

public class EstrategiaDeFeitico implements AcaoDeEsterminio{
    //classe implementando a interface e sobrescrevendo o método como quiser
    @Override
    public void executar() {
        System.out.println("Você lança o feitiço de desintegração e odragão vaporiza em uma pilha de pó!");
    }
}
