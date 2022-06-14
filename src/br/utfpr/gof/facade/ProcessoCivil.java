package br.utfpr.gof.facade;

public class ProcessoCivil extends Processo{

    @Override
    String getDescricao() {
        return "Processo relacionados a bens e questões familiares";
    }
}
