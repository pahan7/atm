package lv.ctco.jschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Card card  = new Card("name", "1234");
        ATM atm = new ATM();
        Scanner scan = new Scanner(System.in);

        atm.display.sayHello();
        atm.display.askForCard();
        if (atm.cardReader.isCardInserted(scan.next())){
            atm.display.askForPin();
            if (atm.cardReader.isPinCorrect(scan.next(),card.getPin())){
                atm.display.showOptions();
                switch (scan.nextInt()){
                    case 1: atm.showBalance(atm.serverConnection.getBankAccount().getBalance());
                        break;
                    case 2: atm.display.askForAmount();
                            double amountOut = atm.withdrawMoney(scan.nextInt());
                            atm.output.moneyToWithdraw(amountOut);
                        break;
                    case 3: atm.display.askForAmount();
                            double amountIn = atm.depositMoney(scan.nextInt());
                            atm.input.moneyToDeposit(amountIn);
                        break;
                    default: System.out.println("Invalid option");
                        break;
                }

            }
        }

    }
}
