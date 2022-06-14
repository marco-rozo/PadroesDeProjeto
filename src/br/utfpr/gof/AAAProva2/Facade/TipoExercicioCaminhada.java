package br.utfpr.gof.AAAProva2.Facade;


public class TipoExercicioCaminhada implements TipoExercicio {

    @Override
    public Exercicio getExercicio() {
        ExercicioCaminhada caminhada = new ExercicioCaminhada();
        return caminhada;
    }
}
