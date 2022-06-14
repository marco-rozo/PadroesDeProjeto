package br.utfpr.gof.command;

public class AtivarTravaCommand implements Command {
    Trava trava;

    public AtivarTravaCommand(Trava trava){
        this.trava = trava;
    }

    @Override
    public void execute() {
        trava.ativar();
    }

    @Override
    public void undo() {
        trava.desativar();
    }
}
