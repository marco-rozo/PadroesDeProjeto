package br.utfpr.gof.AAAProva2.Facade;

public class ControleExercicioFacade {
    public static final int CAMINHADA = 0;
    public static final int CORRIDA = 1;
    public static final int ATIVADO = 2;

    public Exercicio getExercicio(int tipo){
        switch (tipo){
            case CAMINHADA:
                TipoExercicio caminhada = new TipoExercicioCaminhada();
                return  caminhada.getExercicio();
            case CORRIDA:
                TipoExercicio corrida = new TipoExercicioCorrida();
                return  corrida.getExercicio();
            default:
                return null;
        }
    }

    public GPS getLocalizacao(int tipo){
        switch (tipo){
            case ATIVADO:
                TipoLocalizacao acompanhando = new TipoLocalizacaoDesbloqueada();
                return acompanhando.getInfo();
            default:
                TipoLocalizacao semInfo = new TipoLocalizacaoBloqueado();
                return semInfo.getInfo();
        }
    }
}
