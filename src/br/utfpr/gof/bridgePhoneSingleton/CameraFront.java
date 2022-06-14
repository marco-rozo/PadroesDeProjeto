
package br.utfpr.gof.bridgePhoneSingleton;

public class CameraFront implements ICamera {
    @Override
    public void takePhoto() {
        System.out.println("Foto capturada via câmera frontal");
    }
}
