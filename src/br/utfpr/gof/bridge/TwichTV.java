
package br.utfpr.gof.bridge;


public class TwichTV implements IPlatform {
    //implementa a interface para ter acesso aos seus métodos e sobreescrevelos

    //no contrutor chama o método
    public TwichTV() {
        configureRMTP();
        System.out.println("TwichTV: Transmissão iniciada");
    }
    
    @Override //método sobreescrito da interface chamado no construtor
    public void configureRMTP() {
        //chamando outro método
        authToken();
        System.out.println("TwichTV: Configurando RMTP");
    }

    @Override //método sobreescrito da interface chamado no método q foi chamado no construtor
    public void authToken() {
        System.out.println("TwichTV: Validando canal");
    }
    
}
