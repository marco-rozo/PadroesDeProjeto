
package br.utfpr.gof.bridge;


public interface IPlatform {
    //interface para permitir a diferente implementação dos métodos

    void configureRMTP();
    void authToken();
}
