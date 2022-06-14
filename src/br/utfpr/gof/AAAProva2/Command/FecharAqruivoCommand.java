package br.utfpr.gof.AAAProva2.Command;

public class FecharAqruivoCommand implements Command {
    Arquivo arquivo;

    public FecharAqruivoCommand(Arquivo arquivo){
        this.arquivo = arquivo;
    }

    @Override
    public void execute() {
        arquivo.fechar();
    }

    @Override
    public void undo() {
        execute();
    }
}
