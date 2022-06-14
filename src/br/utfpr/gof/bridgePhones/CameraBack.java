
package br.utfpr.gof.bridgePhones;
public class CameraBack implements ICamera {


    @Override
    public void takePhoto() {
        System.out.println("Foto capturada via câmera traseira");
    }
}
