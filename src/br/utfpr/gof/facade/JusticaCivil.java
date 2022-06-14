package br.utfpr.gof.facade;

public class JusticaCivil implements Justica {

    @Override
    public Processo getProcesso() {
        ProcessoCivil processoCivil = new ProcessoCivil();
        return processoCivil;
    }
}
