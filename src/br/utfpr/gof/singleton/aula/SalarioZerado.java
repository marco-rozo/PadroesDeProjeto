package br.utfpr.gof.singleton.aula;

public class SalarioZerado implements Salario {
    @Override
    public void calcularSalario() {
        System.out.println("Não recebe salário");
        ConexaoBancoSingleton.getInstance().conectarBanco();
        SingletonLog.getInstance().doLog("Sem calculo, não recebe");
    }
}
