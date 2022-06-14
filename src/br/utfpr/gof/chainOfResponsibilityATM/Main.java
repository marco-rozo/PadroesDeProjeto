package br.utfpr.gof.chainOfResponsibilityATM;
import java.util.Scanner;

public class Main {

    private DispenseChain c1;

    public Main() {
        // initialize the chain 
        this.c1 = new Real50Dispenser();
        DispenseChain c2 = new Real20Dispenser();
        DispenseChain c3 = new Real10Dispenser();
        // set the chain of responsibility 
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Main atmDispenser = new Main();

        while (true) {
            int amount = 0;
            System.out.println("Informe o valor do saque.");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Valor do saque deve ser múltiplo de 10.");
                return;
            }
            // process the request 
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
