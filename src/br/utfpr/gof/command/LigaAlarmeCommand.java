package br.utfpr.gof.command;

public class LigaAlarmeCommand implements Command {
    Alarme alarme;

    public LigaAlarmeCommand (Alarme alarme){
        this.alarme = alarme;
    }

    @Override
    public void execute() {
        alarme.ativar();
    }

    @Override
    public void undo() {
        alarme.desativar();
    }
}
