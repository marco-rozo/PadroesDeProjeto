package br.utfpr.gof.facade;

public class AdvogadoFacade {
    public static final int CRIMINAL = 0;
    public static final int CIVIL = 1;

    public Processo getProcesso(int tipo){
        switch (tipo){
            case CRIMINAL:
                Justica justicaCriminal = new JusticaCriminal();
                return  justicaCriminal.getProcesso();
            case CIVIL:
                Justica justicaCivil = new JusticaCivil();
                return  justicaCivil.getProcesso();
            default:
                return null;
        }
    }
}
