package br.utfpr.gof.strategy.depois;


public class Main {

    public static void main(String[] args){
        Funcionario e = new Estagiario();
        e.calcularSalario();
        e.calcularFerias();

        Funcionario c = new Contratado();
        c.calcularSalario();
        c.calcularFerias();

        Funcionario v = new Voluntario();
        v.calcularSalario();
        v.calcularFerias();

        Funcionario f = new Freelancer();
        f.calcularSalario();
        f.calcularFerias();

        Funcionario h = new HomeOffice();
        h.calcularSalario();
        h.calcularFerias();
    }
}
