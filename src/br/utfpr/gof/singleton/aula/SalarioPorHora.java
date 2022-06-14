package br.utfpr.gof.singleton.aula;

public class SalarioPorHora implements Salario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário por hora");
        ConexaoBancoSingleton.getInstance().conectarBanco();
        SingletonLog.getInstance().doLog("Cálculo salário por hora");
    }
}
