package br.utfpr.gof.AAAProva2.Command;

public class LerAqruivoCommand implements Command {
    Arquivo arquivo;

    public LerAqruivoCommand(Arquivo arquivo){
        this.arquivo = arquivo;
    }

    @Override
    public void execute() {
        arquivo.ler();
    }

    @Override
    public void undo() {
        arquivo.fechar();
    }
}
