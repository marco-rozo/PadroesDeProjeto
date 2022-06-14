package br.utfpr.gof.AAAProva2.Facade;

public class Main {
    public static void main(String[] args) {
        ControleExercicioFacade controleExercicioFacade = new ControleExercicioFacade();
        Exercicio exercicioCaminhada = controleExercicioFacade.getExercicio(controleExercicioFacade.CAMINHADA);
        System.out.println("Caminhada: " + exercicioCaminhada.getDescricao());
        Exercicio exercicioCorrida = controleExercicioFacade.getExercicio(controleExercicioFacade.CORRIDA);
        System.out.println("Corrida: " + exercicioCorrida.getDescricao());

        GPS ativo = controleExercicioFacade.getLocalizacao(controleExercicioFacade.ATIVADO);
        System.out.println("Localização para monitoramento: " + ativo.getLocalizacao());
        GPS inativo = controleExercicioFacade.getLocalizacao(4);
        System.out.println("Localização para monitoramento: " + inativo.getLocalizacao());
    }
}
