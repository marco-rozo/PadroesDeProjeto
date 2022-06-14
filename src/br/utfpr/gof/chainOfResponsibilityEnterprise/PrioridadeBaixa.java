
package br.utfpr.gof.chainOfResponsibilityEnterprise;


public class PrioridadeBaixa extends Prioridade {

   public PrioridadeBaixa(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Notificação de BAIXA prioridade. " + message);
   }
}
