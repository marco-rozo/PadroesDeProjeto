package br.utfpr.gof.bridge;

/**
 *
 * @author rubia
 * 
 */
public class Main {
    public static void main(String[] args) {
        //chama a função par ainiciar passando a classe a ser iniciada e executada suas funções
        startLive(new Youtube()); //Inicia essa live nessa plataforma
        startLive(new TwichTV()); 
        startLive(new Facebook()); 
    }
    
    //Aqui está a abstração
    public static void startLive(IPlatform platform) { // recebe a plataforma(classe) por parametro


        /*Transmissão padrão*/
        System.out.println("... Aguarde");
        //executa os métodos da classe (que implementa a interface)
        //de acordo com a plataforma recebida por paramentro (classe)
        Live live = new Live(platform);
        //executa os mpetodos
        live.broadcasting();
        live.result();
        //Transmissão avançada
//        System.out.println("Transmissão avançada... Aguarde!");
//        AdvancedLive advancedLive = new AdvancedLive(platform);
//        advancedLive.broadcasting();
//        advancedLive.comments();
//        advancedLive.subtitles();
//        advancedLive.result();
    }
}
