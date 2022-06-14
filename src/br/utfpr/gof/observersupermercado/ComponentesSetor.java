
package br.utfpr.gof.observersupermercado;

public abstract class ComponentesSetor {
    
    public void add(ComponentesSetor componente) {
        throw new UnsupportedOperationException();
    }
    
    public void remove(ComponentesSetor componente) {
        throw new UnsupportedOperationException();
    }
    
    public ComponentesSetor getChild(int i) {
        throw new UnsupportedOperationException();
    }
    
    public void getDescricao(ComponentesSetor componente) {
        throw new UnsupportedOperationException();
    }
    
    public void getPreco(ComponentesSetor componente) {
        throw new UnsupportedOperationException();
    }
    
    public void print(String ident) {
        throw new UnsupportedOperationException();
    }
}
