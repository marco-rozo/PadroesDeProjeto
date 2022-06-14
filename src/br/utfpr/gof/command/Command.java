package br.utfpr.gof.command;

public interface Command {
    public  void execute();
    public  void undo();
}
