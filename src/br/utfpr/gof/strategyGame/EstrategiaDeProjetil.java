package br.utfpr.gof.strategyGame;

public class EstrategiaDeProjetil implements AcaoDeEsterminio{
    //classe implementando a interface e sobrescrevendo o método como quiser

    @Override
    public void executar() {
        System.out.println("Você atira no dragõ com sua arma e ele cai morto no chão!");
    }
}
