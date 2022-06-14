package br.utfpr.gof.AAAProva2.Command;

public class AbrirAqruivoCommand implements Command {
    Arquivo arquivo;

    public AbrirAqruivoCommand(Arquivo arquivo){
        this.arquivo = arquivo;
    }

    @Override
    public void execute() {
        arquivo.abrir();
    }

    @Override
    public void undo() {
        arquivo.fechar();
    }
}
