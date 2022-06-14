
package br.utfpr.gof.factorymethod;


public class SemSalario implements Salario {

    @Override
    public void calcularSalario() {
        System.out.println("Não possui salário");
    }
}
