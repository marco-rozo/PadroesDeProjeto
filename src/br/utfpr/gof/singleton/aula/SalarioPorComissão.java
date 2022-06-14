package br.utfpr.gof.singleton.aula;

public class SalarioPorComissão implements Salario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário por comissão");
        ConexaoBancoSingleton.getInstance().conectarBanco();
        SingletonLog.getInstance().doLog("Cálculo salário por comissão");
    }
}
