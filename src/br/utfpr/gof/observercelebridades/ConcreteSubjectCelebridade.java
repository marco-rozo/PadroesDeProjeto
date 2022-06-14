package br.utfpr.gof.observercelebridades;

import java.util.ArrayList;

public class ConcreteSubjectCelebridade implements Subject {
    private String nomeCelebridade; 
    private ArrayList<Observer> seguidores;
    
    public ConcreteSubjectCelebridade(String nomeCelebridade) {
        this.nomeCelebridade = nomeCelebridade;
        seguidores = new ArrayList<Observer>();
    }
    
    @Override
    public void register(Observer o) {
        seguidores.add(o);
        System.out.println(o + " começou a seguir " + nomeCelebridade);
    }
    
    @Override
    public void unregister(Observer o) {
        seguidores.remove(o);
        System.out.println(o + " deixou de seguir " + nomeCelebridade);
    }
    
    @Override
    public void notifyAllObservers(String info) {
        for (Observer seguidor: seguidores) {
            seguidor.update(nomeCelebridade, info);
        }
    }
    
    public void post(String info) {
        System.out.println("\n "+nomeCelebridade+ " postou: "+ info + "\n");
        notifyAllObservers(info);
    }
    
}
