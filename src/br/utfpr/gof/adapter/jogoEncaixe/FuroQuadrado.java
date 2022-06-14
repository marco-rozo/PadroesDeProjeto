package br.utfpr.gof.adapter.jogoEncaixe;

public class FuroQuadrado {
    private double area;

    public FuroQuadrado(double area){
        this.area = area;
    }

    public double getArea(){
        return this.area;
    }

    public boolean encaixa(PecaQuadrada peca){
        return (this.getArea() >= peca.getArea());
    }
}
