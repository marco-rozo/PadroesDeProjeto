package br.utfpr.gof.bridgePhoneSingleton;

/**
 Escolha uma das classes criadas em um dos exercícios anteriores e a transforme em uma
 classe Singleton. A classe deve ser ajustada de forma que em todo o sistema a mesma tenha
 uma única instância, sendo possível observar na saída da aplicação a simulação de diferentes
 tentativas de fazer essa instanciação.
 */
public class Main {
    public static void main(String[] args) {

        //transformando a classe CameraBack em Singleton
        ICell cellXiaomi =  new Xiaomi( CameraBackSingleton.getInstance(), new CameraFront()); //define o celular passando o tipo dele (Xiaomi) e passando as cameras
        ICell cellSamsung = new Samsung( CameraBackSingleton.getInstance(), new CameraFront());

        photographing(cellXiaomi); //passa para o metodo fotografando
        photographing(cellSamsung);
    }

    public static void photographing(ICell cell){
        //printa as informações das fotos
        cell.takePhoneBack();
        cell.takePhoneFront();
    }
}
