package br.utfpr.gof.strategyGame;

public class ExterminadorDeDragoes {
    //recebe a interface
    private AcaoDeEsterminio acao;

    //constroi a interface de acordo com a que for passada por parametro
    public ExterminadorDeDragoes(AcaoDeEsterminio acao){
        this.acao = acao;
    }

    //altera o método da interface de acordo com a interface passada por parametro
    public void mudaEstrategia(AcaoDeEsterminio acao){
        this.acao = acao;
    }

    //executa o métodod de acordo com a classe iniciada (recebida e contruida por parametro)
    public void iniciarBatalha(){
        acao.executar();
    }
}
