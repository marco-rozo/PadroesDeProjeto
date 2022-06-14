
package br.utfpr.gof.chainOfResponsibilityEnterprise;


public class PrioridadeAlta extends Prioridade {

   public PrioridadeAlta(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Notificação de ALTA prioridade. " + message);
   }
}
