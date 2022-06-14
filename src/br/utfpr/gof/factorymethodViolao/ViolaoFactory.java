
package br.utfpr.gof.factorymethodViolao;


public abstract class ViolaoFactory {
    protected abstract Violao createViolao(String marca);
    
    public Violao calcularPreco(String tipo) {
        Violao violao = createViolao(tipo);
        return violao;
    }
}
