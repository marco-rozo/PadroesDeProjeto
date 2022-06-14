package br.utfpr.gof.adapter.jogoEncaixe;

public class PecaRedonda {
    private double raio;

    public PecaRedonda(){}
    public PecaRedonda(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return  raio;
    }

    public double getDiamento(){
        return Math.pow(this.raio, 2);
    }
}
