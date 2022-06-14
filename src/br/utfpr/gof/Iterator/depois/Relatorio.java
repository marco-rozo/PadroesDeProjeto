
package br.utfpr.gof.Iterator.depois;


public class Relatorio {
    public void imprimeProdutos(Iterator iterator, String descricao) {
        System.out.println("-----"+descricao+"------");
        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            System.out.println(produto.getDescricao()+", "+
                    produto.getPreco());
        }
    }
}
