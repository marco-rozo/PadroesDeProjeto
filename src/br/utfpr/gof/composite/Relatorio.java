
package br.utfpr.gof.composite;


public class Relatorio {
    public void imprimeProdutos(Iterator iterator, String descricao) {
        System.out.println("-----"+descricao+"------");
        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            System.out.println(produto.getDescricao()+", "+
                    produto.getPreco());
        }
    }

    public void imprimeSetoresSupermecado(Iterator iterator) {
        ComponentesSetor setores = new Setor("SETORES SUPERMERCADO");
        ComponentesSetor frutas = new Setor("FRUTAS");
        ComponentesSetor verduras = new Setor("VERDURAS");
        ComponentesSetor verdurasOrganicas = new Setor("ORGÂNICAS");

        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            if ("Frutas".equals(produto.getSetor())) {
                frutas.add(produto);
            } else if ("Verduras".equals(produto.getSetor())) {
                verduras.add(produto);
            } else if ("Organicas".equals(produto.getSetor())) {
                verdurasOrganicas.add(produto);
            } else {
                setores.add(produto);
            }
        }
        setores.add(frutas);
        setores.add(verduras);
        verduras.add(verdurasOrganicas);

        setores.print("-");
    }

}
