package br.utfpr.gof.AAExerc2.n2;

import java.util.ArrayList;

public class Subsalas extends ComponentesSubsalas {
    ArrayList<ComponentesSubsalas> componentes =
            new ArrayList<ComponentesSubsalas>();
    String descricao;
    
    public Subsalas(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public void add(ComponentesSubsalas componente) {
        componentes.add(componente);
    }
    
    @Override
    public void remove(ComponentesSubsalas componente) {
        componentes.remove(componente);
    }
    
    @Override
    public ComponentesSubsalas getChild(int i) {
        return (ComponentesSubsalas) componentes.get(i);
    }
            
    @Override
    public void print(String ident) {
        System.out.println(ident+getDescricao());
        ident += "-";
        for (ComponentesSubsalas c: componentes) {
            c.print(ident);
        }
    }
    
}
