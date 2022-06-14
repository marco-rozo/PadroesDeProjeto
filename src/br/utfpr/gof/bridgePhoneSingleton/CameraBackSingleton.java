package br.utfpr.gof.bridgePhoneSingleton;

public class CameraBackSingleton implements ICamera {

    //transformando a classe CameraBack em Singleton
    private static CameraBackSingleton instance;

    //construtor privado
    private CameraBackSingleton(){}

    public static CameraBackSingleton getInstance(){
        if(instance == null){
            instance = new CameraBackSingleton();
        }

        return instance;
    }

    @Override
    public void takePhoto() {
        System.out.println("Foto capturada via câmera traseira");
    }
}
