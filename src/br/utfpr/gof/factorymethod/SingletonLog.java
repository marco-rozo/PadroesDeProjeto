
package br.utfpr.gof.factorymethod;

import java.util.Calendar;
import java.io.*;


public class SingletonLog {
    private int contador = 0;
    
    private static SingletonLog instancia; //objeto com acesso privativo
    
    //Construtor privado
    private SingletonLog() {
        //O construtor é criado para suprimir o construtor padrão que é público
        //O contador foi incluído apenas para comprovar que é instanciado uma única vez
        this.setContador(this.getContador() + 1);
        //
    }
    
    //Retorna a instância única da classe SingletonLog
    public static SingletonLog getInstance() {
        if (instancia == null) {
            instancia = new SingletonLog();
        }
        return instancia;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    //Faz o log de eventos da aplicação
    public void doLog(String descricaoEvento) {
        //File arquivo = new File("D:/Operacoes.log");
          File arquivo = new File(System.getProperty("user.dir")+"/src/br/utfpr/gof/singleton/singleton.log");
        try {
            FileWriter grava = new FileWriter(arquivo, true);
            PrintWriter escreve = new PrintWriter(grava);
            Calendar cal = Calendar.getInstance();
            escreve.println(cal.getTime() + "ms: "+cal.get(Calendar.MILLISECOND)+
                    "."+descricaoEvento);
            escreve.close();
            grava.close();
            System.out.println("Número de instancias (SingletonLog): "+
                    this.getContador()); //Só para mostrar a instancia única            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
