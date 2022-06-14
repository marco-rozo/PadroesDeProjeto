package br.utfpr.gof.strategy.depois;

public class DireitoFeriasFalse implements Ferias{
    @Override
    public void calcularFerias() {
        System.out.println("Sem dieito a férias");
    }
}
