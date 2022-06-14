package br.utfpr.gof.command;

public class AbrirPortaoCommand implements Command {
    Portao portao;

    public AbrirPortaoCommand(Portao portao){
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.ativar();
    }

    @Override
    public void undo() {
        portao.desativar();
    }
}
