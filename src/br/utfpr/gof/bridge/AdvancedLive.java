
package br.utfpr.gof.bridge;


public class AdvancedLive extends Live {
    
    public AdvancedLive(IPlatform platform) {
        super.platform = platform; //Alimenta o atributo da classe base
    }
    
    public void subtitles() {
        System.out.println("Legenda ativada na transmissão");
    }
    
    public void comments() {
        System.out.println("Comentários liberados na Live");
    }
}
