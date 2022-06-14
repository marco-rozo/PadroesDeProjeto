package br.utfpr.gof.command;


public class FecharPortaoCommand implements Command {
    Portao portao;

    public FecharPortaoCommand(Portao portao){
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.desativar();
    }

    @Override
    public void undo() {
        portao.ativar();
    }
}
