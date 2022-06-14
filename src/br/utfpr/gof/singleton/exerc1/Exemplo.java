package br.utfpr.gof.singleton.exerc1;

public class Exemplo {
    private static int numInstancias = 0;
    private int count = 0;
    private static Exemplo instanciaExemplo;

    private Exemplo(){
        numInstancias = 1;
        count = ++numInstancias;
    }

    public String toString() {
        System.out.println("Número de instancias: " + count);
        return "Número de instâncias de Exemplo: " + numInstancias;
    }

    public static Exemplo getInstance(){
        if(numInstancias == 0){
            numInstancias = 1;
            instanciaExemplo = new Exemplo();
        }

        return instanciaExemplo;
    }
}