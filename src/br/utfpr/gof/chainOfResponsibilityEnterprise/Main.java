package br.utfpr.gof.chainOfResponsibilityEnterprise;


public class Main {
    private static Prioridade getChainOfPrioridade(){

        Prioridade baixaPrioridade = new PrioridadeBaixa(Prioridade.BAIXA);
        Prioridade mediaPrioridade = new PrioridadeMedia(Prioridade.MEDIA);
        Prioridade altaPrioridade = new PrioridadeAlta(Prioridade.ALTA);

        baixaPrioridade.setNextLogger(mediaPrioridade);
        mediaPrioridade.setNextLogger(altaPrioridade);

        return baixaPrioridade;
    }

    public static void main(String[] args) {
        Prioridade prioridade = getChainOfPrioridade();

        prioridade.prioridadeMessage(Prioridade.BAIXA,"Iniciada no ELO 1.");
    }
}
