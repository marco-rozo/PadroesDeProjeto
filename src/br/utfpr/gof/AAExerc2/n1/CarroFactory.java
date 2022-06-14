package br.utfpr.gof.AAExerc2.n1;

public interface CarroFactory {
    Motor defineTipoMotor();
    Bateria defineTipoBateria();
    FichaTecnica criaFichaTecnica();
}
