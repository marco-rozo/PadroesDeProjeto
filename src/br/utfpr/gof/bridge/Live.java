
package br.utfpr.gof.bridge;


//Implementa  interface
public class Live implements ITransmission {
    //declara um método protegido
    protected IPlatform platform;

    //contrutor vazio
    public Live() {
        
    }
    
    //Polimorfismo
    //contrutor recebendo a plataforma por parametro
    public Live(IPlatform platform) {
        this.platform = platform;
    }
    
    @Override //método sobreescrito
    public void broadcasting() {
        System.out.println("Iniciando a transmissão");
    }

    @Override //método sobreescrito
    public void result() {
        System.out.println("NO AR");
    }
    
}
