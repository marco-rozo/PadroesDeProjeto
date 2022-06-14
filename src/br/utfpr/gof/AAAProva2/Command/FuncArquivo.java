package br.utfpr.gof.AAAProva2.Command;


public class FuncArquivo {
    private static final int FUNCOES = 4;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommands;

    public FuncArquivo(){
        onCommands = new Command[FUNCOES];
        offCommands = new Command[FUNCOES];

        for (int i = 0; i< FUNCOES; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int func, Command onCommand, Command offCommand){
        onCommands[func] = onCommand;
        offCommands[func] = offCommand;
    }

    public  void ligar(int func){
        onCommands[func] .execute();
        undoCommands = onCommands[func];
    }

    public void desligar(int func){
        offCommands[func] .execute();
        undoCommands = offCommands[func];
    }

    public void undo() {
        undoCommands.undo();
    }


    public  String toString(){
        StringBuilder stringB = new StringBuilder();
        stringB.append("\n----Funções Arquivo----\n");
        for (int i =0; i< onCommands.length; i++){
            stringB.append (" [func ");
            stringB.append (i);
            stringB.append ("] ");
            stringB.append (onCommands [i].getClass().getCanonicalName());
            stringB.append ("\t");
            stringB.append (offCommands [i].getClass().getName());
            stringB.append ("\n");
        }

        return stringB.toString();
    }

}
