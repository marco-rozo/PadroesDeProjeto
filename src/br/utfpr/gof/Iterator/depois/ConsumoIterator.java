
package br.utfpr.gof.Iterator.depois;

import java.util.ArrayList;


public class ConsumoIterator  implements Iterator {

    private ArrayList<Produto> consumo;
    private int index = 0;
    
    public ConsumoIterator(ArrayList<Produto> consumos) {
        this.consumo = consumos;
    }
    
    @Override
    public boolean hasNext() {
        return index < consumo.size()  && consumo.get(index) != null;
    }
    
    @Override
    public Object next() {
        return consumo.get(index++);
    }
}

