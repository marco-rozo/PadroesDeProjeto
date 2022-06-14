
package br.utfpr.gof.factorymethod;


public class ComFerias implements Ferias {

    @Override
    public void calcularFerias() {
        System.out.println("Férias calculadas");
        SingletonLog.getInstance().doLog("Férias calculadas");
    }
}

