package br.utfpr.gof.AAExerc2.n2;

import java.util.ArrayList;
public class SalaIterator implements Iterator {
    private ArrayList<Sala> salas;
    private int index;
    
    public SalaIterator(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
    @Override
    public boolean hasNext() {
        return index < salas.size() && salas.get(index) != null;
    }
    
    @Override
    public Object next() {
        return salas.get(index++);
    }
}
