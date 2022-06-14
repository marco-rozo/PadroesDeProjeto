package br.utfpr.gof.singleton.aula;

import java.io.File;
import java.io.*;
import java.util.Calendar;

public class SingletonLog {
    private int contador = 0;

    private static SingletonLog instancia;

    //construtor privado
    private SingletonLog(){
        //O construtor é criado oara suprir o contrutor padrão que é público
        //o contador foi incluido apenas para provar que é instanciado uma única vez
        this.setContador(this.getContador() +1);
    }

    public static SingletonLog getInstance(){
        if(instancia == null){
            instancia = new SingletonLog();
        }

        return instancia;
    }

    public int getContador(){
        return this.contador;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public  void doLog(String descricaoEvento){
        File arquivo = new File(System.getProperty("user.dir")+"/src/br/utfpr/gof/singleton/singleton.log");
        try {
            FileWriter grava = new FileWriter(arquivo, true);
            PrintWriter escreve = new PrintWriter(grava);
            Calendar calendar = Calendar.getInstance();
            escreve.println(calendar.getTime() + "ms: " + calendar.get(Calendar.MILLISECOND) +
                    "."+descricaoEvento);
            escreve.close();
            grava.close();
            System.out.println("Número de instancias (SingletonLog): " + this.getContador());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
