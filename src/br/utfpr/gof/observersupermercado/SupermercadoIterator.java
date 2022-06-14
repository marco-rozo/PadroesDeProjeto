package br.utfpr.gof.observersupermercado;
import java.util.ArrayList;

public class SupermercadoIterator  implements Iterator {
    private ArrayList<Produto> produtos;
    private int index;
    
    public SupermercadoIterator(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public boolean hasNext() {
        return index < produtos.size() && produtos.get(index) != null;
    }
    
    @Override
    public Object next() {
        return produtos.get(index++);
    }
}
