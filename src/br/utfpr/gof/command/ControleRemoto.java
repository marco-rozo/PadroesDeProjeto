package br.utfpr.gof.command;

public class ControleRemoto {
    private static final int BOTOES = 3;
    private Command [] onCommands;
    private Command [] offCommands;
    private Command undoCommands;

    public ControleRemoto(){
        onCommands = new Command[BOTOES];
        offCommands = new Command[BOTOES];

        for (int i = 0; i< BOTOES; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int botao, Command onCommand, Command offCommand){
        onCommands[botao] = onCommand;
        offCommands[botao] = offCommand;
    }

    public  void ligar(int botao){
        onCommands[botao] .execute();
        undoCommands = onCommands[botao];
    }

    public void desligar(int botao){
        offCommands[botao] .execute();
        undoCommands = offCommands[botao];
    }

    public void undo() {
        undoCommands.undo();
    }


    public  String toString(){
        StringBuilder stringB = new StringBuilder();
        stringB.append("\n----Controle Remoto----\n");
        for (int i =0; i< onCommands.length; i++){
            stringB.append (" [botao ");
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
