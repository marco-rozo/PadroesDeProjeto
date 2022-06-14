package br.utfpr.gof.AAAProva2.Command;

public class EscreverAqruivoCommand implements Command {
    Arquivo arquivo;

    public EscreverAqruivoCommand(Arquivo arquivo){
        this.arquivo = arquivo;
    }

    @Override
    public void execute() {
        arquivo.escrever();
    }

    @Override
    public void undo() {
        arquivo.fechar();
    }
}
