
package br.utfpr.gof.factorymethod;


public class SemFerias implements Ferias {
    
    @Override
    public void calcularFerias(){
        System.out.println("Não possui direito a férias");
        SingletonLog.getInstance().doLog("Férias não calculadas");
    }
}

