package br.utfpr.gof.AAAProva2.Facade;


public class TipoExercicioCorrida implements TipoExercicio {

    @Override
    public Exercicio getExercicio() {
        ExercicioCorrida corrida = new ExercicioCorrida();
        return corrida;
    }
}
