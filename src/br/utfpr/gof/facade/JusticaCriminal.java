package br.utfpr.gof.facade;

public class JusticaCriminal implements Justica {
    @Override
    public Processo getProcesso() {
        ProcessoCriminal processoCriminal = new ProcessoCriminal();
        return processoCriminal;
    }
}
