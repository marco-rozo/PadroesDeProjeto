package br.utfpr.gof.AAExerc2.n1;


public class Main {
    public static void main(String[] args) {
        CarroFactory car = new tipoCarroEletrico();
        FichaTecnica ft = car.criaFichaTecnica();
        Motor motor = car.defineTipoMotor();
        Bateria bt = car.defineTipoBateria();

        System.out.println("==============Veículo Elétrico=================");
        ft.itensfichatecnica();
        motor.tipomotor();
        bt.tipobateria();
        System.out.println("===============================================");

        car = new tipoCarroHibrido();
        ft = car.criaFichaTecnica();
        motor = car.defineTipoMotor();
        bt = car.defineTipoBateria();
        System.out.println("\n================Veículo Híbrido===============");
        ft.itensfichatecnica();
        motor.tipomotor();
        bt.tipobateria();
        System.out.println("===============================================");
    }
}
