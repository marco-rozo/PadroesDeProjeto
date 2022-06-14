
package br.utfpr.gof.bridgePhones;

public class Xiaomi implements ICell{
    private ICamera cameraFront;
    private ICamera cameraBack;

    public Xiaomi(ICamera back, ICamera front) { //constroi o celular com as cameras recebidas
        cameraBack = back;
        cameraFront =  front;
    }

    @Override //implementa o método de tirar foto traseira
    public void takePhoneFront() {
        System.out.println("-----------------------------");
        System.out.println("Captura via celular Xiaomi");
        System.out.println("-----------------------------");
        cameraFront.takePhoto(); // tira a foto
    }

    @Override
    public void takePhoneBack() {
        System.out.println("-----------------------------");
        System.out.println("Captura via celular Xiaomi");
        System.out.println("-----------------------------");
        cameraBack.takePhoto();
    }
}
