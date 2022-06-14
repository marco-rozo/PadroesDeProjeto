
package br.utfpr.gof.chainOfResponsibilityEnterprise;


public class PrioridadeMedia extends Prioridade {

   public PrioridadeMedia(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Notificação de MEDIA prioridade. " + message);
   }
}
