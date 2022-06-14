package br.utfpr.gof.observercelebridades;

public class Main {
    public static void main(String[] args) {
        ConcreteSubjectCelebridade demi = new ConcreteSubjectCelebridade("Demi Lovato");
        ConcreteSubjectCelebridade pele = new ConcreteSubjectCelebridade("Pelé");
        ConcreteSubjectCelebridade ricardo = new ConcreteSubjectCelebridade("Ricardo Solares");
        ConcreteObserverFa marcelo = new ConcreteObserverFa("Marcelo Parabocz");
        ConcreteObserverFa vinicius = new ConcreteObserverFa("Vinicius");
        ConcreteObserverFa marceloF = new ConcreteObserverFa("Marcelo Falchi");
        ConcreteObserverFa lucas = new ConcreteObserverFa("Lucas");
        ConcreteObserverFa leonardo = new ConcreteObserverFa("Leonardo");
        
        demi.register(vinicius);
        demi.register(leonardo);
        pele.register(marcelo);
        ricardo.register(marceloF);
        ricardo.register(vinicius);
        pele.register(lucas);
        
        pele.post("Comemoração do aniversário de 94 anos do Pelé...");
        demi.post("Demi Lovato fala sobre sua experiência de vida passada");
        ricardo.post("Ricardo sugere alguns filmes de ação");
        pele.unregister(lucas);
        pele.post("Todos os meus seguidores terão entrada livre para o aniversário");
        
    }
}
