package br.utfpr.gof.observercelebridades;


public class ConcreteObserverFa implements Observer {
    private String nomeFa;
    
    public ConcreteObserverFa(String nomeFa) {
        this.nomeFa = nomeFa;
    }
    
    @Override
    public void update(String nomeCelebridade, String info) {
        System.out.println(nomeFa + " recebeu um post de "+nomeCelebridade +
                ": "+info);
    }
    
    @Override
    public String toString() {
        return nomeFa;
    }
}
