package br.utfpr.gof.adapter.vendaEOrdemDeServico;

public interface Documento {
    //Interface com os métodos "padrões"
    public void abreDocumento();
    public void vendeItem ();
    public void fazPagamento ();
    public void fechaDocumento();
}
