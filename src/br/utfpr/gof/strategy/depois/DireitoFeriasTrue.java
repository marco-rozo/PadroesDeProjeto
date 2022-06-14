package br.utfpr.gof.strategy.depois;

public class DireitoFeriasTrue implements Ferias{
    @Override
    public void calcularFerias() {
        System.out.println("Com direito a férias");
    }
}
