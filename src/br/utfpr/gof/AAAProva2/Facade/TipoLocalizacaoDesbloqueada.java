package br.utfpr.gof.AAAProva2.Facade;


public class TipoLocalizacaoDesbloqueada implements TipoLocalizacao {

    @Override
    public GPS getInfo() {
        GpsDesbloqueado gps = new GpsDesbloqueado();
        return gps;
    }
}
