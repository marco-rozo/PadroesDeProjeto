package br.utfpr.gof.observersupermercado;

import java.util.ArrayList;

public class ConcreteSubjectEstoque implements Subject{
    private ArrayList observers;
    private float qtdEstoque;
    private Produto produto;
    
    public ConcreteSubjectEstoque() {
        observers = new ArrayList();
    }
    
    @Override
    public void registerObserver(Observer estoque) {
        observers.add(estoque);
    }
    
    @Override
    public void removeObserver(Observer estoque) {
        int i = observers.indexOf(estoque);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(produto, qtdEstoque);
        }
    }
    
    public void estoqueAlterado() {
        notifyObservers();
    }
    
    public void setEstoque(Produto produto, float qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
        this.produto = produto;
        estoqueAlterado();
    }
    
}
