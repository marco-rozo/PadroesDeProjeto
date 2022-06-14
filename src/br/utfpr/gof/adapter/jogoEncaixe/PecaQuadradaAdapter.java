package br.utfpr.gof.adapter.jogoEncaixe;

public class PecaQuadradaAdapter extends PecaRedonda{
    private PecaQuadrada peca;

    public PecaQuadradaAdapter(PecaQuadrada peca){
        this.peca = peca;
    }

    public double getRaio(){
        return (Math.sqrt(Math.pow((peca.getLargura() / 2), 2)) * 2);
    }
}
