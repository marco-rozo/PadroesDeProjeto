package br.utfpr.gof.adapter.jogoEncaixe;

public class FuroRedondo {
    private double raio;

    public FuroRedondo(double raio){
        this.raio = raio;
    }

    public double gerRaio(){
        return raio;
    }

    public boolean encaixa(PecaRedonda peca){
        return (this.gerRaio() >= peca.getRaio());
    }
}
