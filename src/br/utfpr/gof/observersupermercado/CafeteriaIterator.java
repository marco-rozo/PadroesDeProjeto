
package br.utfpr.gof.observersupermercado;

public class CafeteriaIterator implements Iterator {
    private Produto[] produtos;
    private int index;
    
    public CafeteriaIterator(Produto[] produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public boolean hasNext() {
        return index < produtos.length && produtos[index] != null;
    }
    
    @Override
    public Object next() {
        return produtos[index++];
    }
}
