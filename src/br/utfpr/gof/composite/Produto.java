
package br.utfpr.gof.composite;


public class Produto extends ComponentesSetor {
    private String descricao;
    private double preco;
    private String setor;

    public Produto(String descricao, double preco, String setor) {
        this.descricao = descricao;
        this.preco = preco;
        this.setor = setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public void print(String ident) {
        System.out.println(ident + getDescricao());
    }
    
}
