package br.utfpr.gof.AAAProva2.Composite;

import java.util.ArrayList;
public class PastaIterator implements Iterator {
    private ArrayList<Arquivo> arquivos;
    private int index;
    
    public PastaIterator(ArrayList<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }
    
    @Override
    public boolean hasNext() {
        return index < arquivos.size() && arquivos.get(index) != null;
    }
    
    @Override
    public Object next() {
        return arquivos.get(index++);
    }
}
