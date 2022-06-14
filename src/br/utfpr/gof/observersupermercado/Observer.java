package br.utfpr.gof.observersupermercado;
public interface Observer {
    public void update(Produto produto, float qtdEstoque);
}
