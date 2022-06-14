
package br.utfpr.gof.composite;

import java.util.ArrayList;


public class Setor extends ComponentesSetor {
    ArrayList<ComponentesSetor> componentes = 
            new ArrayList<ComponentesSetor>();
    String descricao;
    
    public Setor(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public void add(ComponentesSetor componente) {
        componentes.add(componente);
    }
    
    @Override
    public void remove(ComponentesSetor componente) {
        componentes.remove(componente);
    }
    
    @Override
    public ComponentesSetor getChild(int i) {
        return (ComponentesSetor) componentes.get(i);
    }
            
    @Override
    public void print(String ident) {
        System.out.println(ident+getDescricao());
        ident += "-";
        for (ComponentesSetor c: componentes) {
            c.print(ident);
        }
    }
    
}
