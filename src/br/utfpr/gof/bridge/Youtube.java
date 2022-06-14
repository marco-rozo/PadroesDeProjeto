
package br.utfpr.gof.bridge;


public class Youtube implements IPlatform {
    //implementa a interface para ter acesso aos métodos e sobrescrevelos
    
    public Youtube() {
        //chama o método sobrescrito no contrutor
        configureRMTP();
        System.out.println("Youtube: Transmissão iniciada");
    }
    
    @Override
    public void configureRMTP() {
        authToken(); //chama o outro método sobrescrito
        System.out.println("Youtube: Configurando broadcasting");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizando aplicação");
    }       
}
