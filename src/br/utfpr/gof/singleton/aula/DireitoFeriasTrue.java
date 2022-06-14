package br.utfpr.gof.singleton.aula;

public class DireitoFeriasTrue implements Ferias {
    @Override
    public void calcularFerias() {
        System.out.println("Com direito a férias");
        ConexaoBancoSingleton.getInstance().conectarBanco();
        SingletonLog.getInstance().doLog("Possui direito a Férias");
    }
}
