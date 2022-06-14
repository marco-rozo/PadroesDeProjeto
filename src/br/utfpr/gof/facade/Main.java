package br.utfpr.gof.facade;

public class Main {
    public static void main(String[] args) {
        AdvogadoFacade advogadoFacade = new AdvogadoFacade();
        Processo processoCivil = advogadoFacade.getProcesso(AdvogadoFacade.CIVIL);
        System.out.println("Civil: " + processoCivil.getDescricao());
        Processo processoCriminal = advogadoFacade.getProcesso(AdvogadoFacade.CRIMINAL);
        System.out.println("Criminal: " + processoCriminal.getDescricao());
    }
}
