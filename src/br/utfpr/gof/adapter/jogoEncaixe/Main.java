package br.utfpr.gof.adapter.jogoEncaixe;

public class Main {

    public static void main(String[] args) {
        FuroRedondo furoRedondo = new FuroRedondo(5);
        FuroQuadrado furoQuadrado = new FuroQuadrado(20);

        PecaRedonda pequenaR = new PecaRedonda(5);
        PecaRedonda grandeR = new PecaRedonda(20);

        if(furoRedondo.encaixa(pequenaR)){
            System.out.println("Peça redonda de raio 5 encaixa no furo redondo de raio 5");
        }
        if(!furoRedondo.encaixa(grandeR)){
            System.out.println("Peça redonda de raio 20 não encaixa no furo redondo de raio 5");
        }

        PecaQuadrada pequenaQ = new PecaQuadrada(2);
        PecaQuadrada grandeQ = new PecaQuadrada(20);

        if(furoQuadrado.encaixa(pequenaQ)){
            System.out.println("Peça quadrada de largura 2 encaixa no furo quadrado de largura 5");
        }
        if(!furoQuadrado.encaixa(grandeQ)){
            System.out.println("Peça quadrada de largura 20 não encaixa no furo quadrado de largura 5");
        }

        PecaQuadradaAdapter adapterQP = new PecaQuadradaAdapter(pequenaQ);
        PecaQuadradaAdapter adapterQG = new PecaQuadradaAdapter(grandeQ);
        if (furoRedondo.encaixa(adapterQP)){
            System.out.println("Peça quadrada de largura 2 encaixa no furo redondo de raio 5");
        }

        if (!furoRedondo.encaixa(adapterQG)){
            System.out.println("Peça quadrada de largura 20 não encaixa no furo redondo de raio 5");
        }
    }
}
