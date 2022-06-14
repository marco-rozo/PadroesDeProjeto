
package br.utfpr.gof.bridgePhones;

public class Samsung implements ICell{
    private ICamera cameraFront;
    private ICamera cameraBack;

    public Samsung(ICamera back, ICamera front) {
        cameraBack = back;
        cameraFront =  front;
    }

    @Override
    public void takePhoneFront() {
        System.out.println("-----------------------------");
        System.out.println("Captura via celular Xiaomi");
        System.out.println("-----------------------------");
        cameraFront.takePhoto();
    }

    @Override
    public void takePhoneBack() {
        System.out.println("-----------------------------");
        System.out.println("Captura via celular Xiaomi");
        System.out.println("-----------------------------");
        cameraBack.takePhoto();
    }
}
