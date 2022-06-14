package br.utfpr.gof.singleton.aula;

public class DireitoFeriasFalse implements Ferias {
    @Override
    public void calcularFerias() {
        System.out.println("Sem dieito a férias");
        ConexaoBancoSingleton.getInstance().conectarBanco();
        SingletonLog.getInstance().doLog("Não possui direito a Férias");
    }
}
