
package br.utfpr.gof.chainOfResponsibilityATM;


public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
