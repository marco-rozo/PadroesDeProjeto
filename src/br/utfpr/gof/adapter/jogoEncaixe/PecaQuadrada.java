package br.utfpr.gof.adapter.jogoEncaixe;

public class PecaQuadrada {
    private double largura;

    public PecaQuadrada(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getArea() {
        return Math.pow(this.largura, 2);
    }
}
