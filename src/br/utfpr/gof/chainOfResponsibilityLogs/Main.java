package br.utfpr.gof.chainOfResponsibilityLogs;

/**
 * Criamos uma classe abstrata AbstractLogger com um nível de logging. 
 * Em seguida, criamos três tipos de loggers estendendo o AbstractLogger. 
 * Cada registrador verifica o nível de mensagem para seu nível e imprime 
 * de acordo, caso contrário não imprime e passa a mensagem para seu próximo 
 * registrador.
 */
public class Main {
	
   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);

      return errorLogger;	
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger.INFO, "Information.");
      loggerChain.logMessage(AbstractLogger.DEBUG, "Debug.");
      loggerChain.logMessage(AbstractLogger.ERROR, "Error.");
   }
}
