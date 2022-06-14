package br.utfpr.gof.AAAProva2.Facade;

public class GpsBloqueado extends GPS {

    @Override
    String getLocalizacao() {
        return "XingLing controlado pelo governo não libera localização (para você)";
    }
}
