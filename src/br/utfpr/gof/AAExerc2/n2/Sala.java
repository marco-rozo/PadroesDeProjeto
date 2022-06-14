package br.utfpr.gof.AAExerc2.n2;

public class Sala extends ComponentesSubsalas {
    private String descricao;
    private String subsala;

    public Sala(String descricao, String subsala) {
        this.descricao = descricao;
        this.subsala = subsala;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSubsala() {
        return subsala;
    }

    public void setSubsala(String subsala) {
        this.subsala = subsala;
    }
    
    @Override
    public void print(String ident) {
        System.out.println(ident + getDescricao());
    }
    
}
