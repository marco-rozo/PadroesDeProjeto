package br.utfpr.gof.AAExerc2.n2;

import java.util.ArrayList;

public class SalasSubsalas {
    private ArrayList<Sala> salaArrayList;
    
    public SalasSubsalas() {
        salaArrayList = new ArrayList<Sala>();
        addSala("Sala A 1",  "Sala A");
        addSala("Sala A 2",  "Sala A");
        addSala("Sala A 3",  "Sala A");
        addSala("Sala B 1",  "Sala B");
        addSala("Sala B 1.1",  "Sala B 1");
        addSala("Sala B 1.2",  "Sala B 1");
        addSala("Sala B 2",  "Sala B");
        addSala("Sala B 1.3",  "Sala B 1");
    }
    
    public void addSala(String descricao, String setor) {
        Sala sala = new Sala(descricao, setor);
        salaArrayList.add(sala);
    }
    
    public ArrayList<Sala> getProdutos() {
        return salaArrayList;
    }
    
    public Iterator createIterator() {
        return new SalaIterator(salaArrayList);
    }
}
