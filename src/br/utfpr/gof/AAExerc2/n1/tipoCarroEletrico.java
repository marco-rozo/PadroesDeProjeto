package br.utfpr.gof.AAExerc2.n1;


public class tipoCarroEletrico implements CarroFactory {

    @Override
    public Motor defineTipoMotor() {
        return new MotorCarroEletrico();
    }

    @Override
    public Bateria defineTipoBateria() {
        return new BateriaCarroEletrico();
    }

    @Override
    public FichaTecnica criaFichaTecnica() {
        return new FichaTecnicaCarroEletrico();
    }
}
