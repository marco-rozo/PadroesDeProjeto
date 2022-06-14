package br.utfpr.gof.chainOfResponsibilityEnterprise;


public abstract class Prioridade {
    public static int BAIXA = 1;
    public static int MEDIA = 2;
    public static int ALTA = 3;

    protected int level;

    //next element in chain or responsibility
    protected Prioridade nextPrioridade;

    public void setNextLogger(Prioridade nextPrioridade){
        this.nextPrioridade = nextPrioridade;
    }

    public void prioridadeMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextPrioridade !=null){
            nextPrioridade.prioridadeMessage(level, message);
        }
    }
    abstract protected void write(String message);

}

