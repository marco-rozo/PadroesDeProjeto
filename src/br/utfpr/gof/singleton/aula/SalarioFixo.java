package br.utfpr.gof.singleton.aula;

public class SalarioFixo implements Salario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário fixo");
        SingletonLog.getInstance().doLog("Cálculo salário fixo");
    }
}
