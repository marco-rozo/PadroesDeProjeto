package br.utfpr.gof.observercelebridades;

public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyAllObservers(String s);
}
