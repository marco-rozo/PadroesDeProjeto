package br.utfpr.gof.AAExerc2.n1;


public class tipoCarroHibrido implements CarroFactory {

    @Override
    public Motor defineTipoMotor() {
        return new MotorCarroHibrido();
    }

    @Override
    public Bateria defineTipoBateria() {
        return new BateriaCarroHibrido();
    }

    @Override
    public FichaTecnica criaFichaTecnica() {
        return new FichaTecnicaCarroHibrido();
    }
}
