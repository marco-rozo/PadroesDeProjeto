
package br.utfpr.gof.factorymethod;


public class FuncionarioFactoryConcreto extends FuncionarioFactory {
    
    @Override
    public Funcionario createFuncionario(String tipo) {
        if ("ESTAGIARIO".equals(tipo)) {
            return new Estagiario();
        } else if ("CONTRATADO".equals(tipo)) {
            return new Contratado();
        } else if ("FREELANCER".equals(tipo)) {
            return new Freelancer();
        } else if ("HOMEOFFICE".equals(tipo)) {
            return new HomeOffice();
        } else if ("VOLUNTARIO".equals(tipo)) {
            return new Voluntario();
        }
        return null;
    }
            
    
}
