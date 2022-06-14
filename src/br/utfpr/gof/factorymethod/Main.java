
package br.utfpr.gof.factorymethod;


public class Main {
    public static void main(String[] args) {
        //Uso do padrão Factory Method para instanciar os diferentes tipos de 
        //funcionário. Internamente o método fazerPagamento chama o 
        //factory method createFuncionario e já realiza os cálculos de férias e
        //salário
        FuncionarioFactory fabrica = new FuncionarioFactoryConcreto();

        System.out.println("---Estagiario ");
        Funcionario e = fabrica.fazerPagamento("ESTAGIARIO");

        System.out.println("---Contratado ");
        Funcionario c = fabrica.fazerPagamento("CONTRATADO");
        
        System.out.println("---Voluntario ");
        Funcionario v = fabrica.fazerPagamento("VOLUNTARIO");
        
        System.out.println("---Freelancer");
        Funcionario f = fabrica.fazerPagamento("FREELANCER");
        
        System.out.println("---HomeOffice");
        Funcionario h = fabrica.fazerPagamento("HOMEOFFICE");

    }
}
