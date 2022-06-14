package br.utfpr.gof.facade;

public class ProcessoCriminal extends Processo{

    @Override
    String getDescricao() {
        return "Processo relacionados a pessoas que cometem crimes, ou seja, " +
                "infrigem as leis";
    }
}
