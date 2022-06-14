package br.utfpr.gof.AAAProva2.Composite;

import java.util.ArrayList;

public class Subpastas extends ComponentesSubpastas {
    ArrayList<ComponentesSubpastas> componentes =
            new ArrayList<ComponentesSubpastas>();
    String descricao;
    
    public Subpastas(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public void add(ComponentesSubpastas componente) {
        componentes.add(componente);
    }
    
    @Override
    public void remove(ComponentesSubpastas componente) {
        componentes.remove(componente);
    }
    
    @Override
    public ComponentesSubpastas getChild(int i) {
        return (ComponentesSubpastas) componentes.get(i);
    }
            
    @Override
    public void print(String ident) {
        System.out.println(ident+getDescricao());
        ident += "-";
        for (ComponentesSubpastas c: componentes) {
            c.print(ident);
        }
    }
    
}
