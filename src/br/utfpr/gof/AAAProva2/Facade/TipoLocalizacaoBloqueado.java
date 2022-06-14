package br.utfpr.gof.AAAProva2.Facade;


public class TipoLocalizacaoBloqueado implements TipoLocalizacao {

    @Override
    public GPS getInfo() {
        GpsBloqueado gps = new GpsBloqueado();
        return gps;
    }
}
