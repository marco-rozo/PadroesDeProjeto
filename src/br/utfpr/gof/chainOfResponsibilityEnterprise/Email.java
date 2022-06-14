package br.utfpr.gof.chainOfResponsibilityEnterprise;

import br.utfpr.gof.facade.Justica;
import br.utfpr.gof.facade.JusticaCivil;
import br.utfpr.gof.facade.JusticaCriminal;

public abstract class Email {
    public static final int SUPORTE = 1;
    public static final int GERENCIA = 2;
    public static final int DIRETORIA = 3;

    public void envioEmail(int tipo){
        System.out.println("E-mail enviado para o Setor de " + getLocal(tipo) + ". ");
    }

    public String getLocal(int tipo){
        switch (tipo){
            case SUPORTE:
                return "SUPORTE";
            case GERENCIA:
                return "GERENCIA";
            case DIRETORIA:
                return "DIRETORIA";
            default:
                return null;
        }
    }
}
