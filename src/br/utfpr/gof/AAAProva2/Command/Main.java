package br.utfpr.gof.AAAProva2.Command;

public class Main {

    public static void main(String[] args) {
        FuncArquivo funcArq = new FuncArquivo();
        Arquivo arq = new Arquivo();
        funcArq.setCommand(0, new LerAqruivoCommand(arq), new FecharAqruivoCommand(arq));
        funcArq.setCommand(1, new EscreverAqruivoCommand(arq), new FecharAqruivoCommand(arq));
        funcArq.setCommand(2, new AbrirAqruivoCommand(arq), new FecharAqruivoCommand(arq));
        System.out.println(funcArq);
    }
}
