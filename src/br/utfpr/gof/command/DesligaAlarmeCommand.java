package br.utfpr.gof.command;

public class DesligaAlarmeCommand implements Command {
    Alarme alarme;

    public DesligaAlarmeCommand(Alarme alarme){
        this.alarme = alarme;
    }

    @Override
    public void execute() {
        alarme.desativar();
    }

    @Override
    public void undo() {
        alarme.ativar();
    }
}
