package br.utfpr.gof.AAAProva2.Composite;

public class Arquivo extends ComponentesSubpastas {
    private String nome;
    private String subpasta;
    private String tamanho;

    public Arquivo(String nome, String subpasta, String tamanho) {
        this.nome = nome;
        this.subpasta = subpasta;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSubpasta() {
        return subpasta;
    }

    public void setSubpasta(String subpasta) {
        this.subpasta = subpasta;
    }
    
    @Override
    public void print(String ident) {
        System.out.println(ident + getNome());
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
