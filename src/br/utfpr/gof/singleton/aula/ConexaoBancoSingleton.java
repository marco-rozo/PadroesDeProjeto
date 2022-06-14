package br.utfpr.gof.singleton.aula;

public class ConexaoBancoSingleton {
    private int contador = 0;

    private static ConexaoBancoSingleton instancia;

    //construtor privado
    private ConexaoBancoSingleton(){
        this.setContador(this.getContador() +1);
    }

    public static ConexaoBancoSingleton getInstance(){
        if(instancia == null){
            instancia = new ConexaoBancoSingleton();
        }
        System.out.println("***************** INSTANCIA BANCO DE DADOS *****************");
        return instancia;
    }

    public int getContador(){
        return this.contador;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public  void conectarBanco(){
        System.out.println("Número de instancias (ConexaoBancoSingleton): " + this.getContador());
        System.out.println("--------------------- Conectado ao banco ---------------------");
    }
}
