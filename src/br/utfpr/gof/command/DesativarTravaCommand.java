package br.utfpr.gof.command;

public class DesativarTravaCommand implements Command {
    Trava trava;

    public DesativarTravaCommand(Trava trava){
        this.trava = trava;
    }

    @Override
    public void execute() {
        trava.desativar();
    }

    @Override
    public void undo() {
        trava.ativar();
    }
}
