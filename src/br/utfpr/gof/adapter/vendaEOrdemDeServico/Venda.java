package br.utfpr.gof.adapter.vendaEOrdemDeServico;

public class Venda implements Documento{
    //classe q implementa a iterface tendo acesso aos seus métodos e imlementando eles
    @Override
    public void abreDocumento() {
        System.out.println("Abre documento venda...");
    }

    @Override
    public void vendeItem() {
        System.out.println("Vende item venda...");
    }

    @Override
    public void fazPagamento() {
        System.out.println("Faz pagamento venda...");
    }

    @Override
    public void fechaDocumento() {
        System.out.println("Fecha documento venda...");
    }
}
