package lv.ctco.jschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Card card  = new Card("name", "1234");
        ATM atm;
        Scanner scan = new Scanner(System.in);

        atm.display.sayHello();
        atm.display.askForCard();
        if (atm.cardReader.isCardInserted()){
            if (atm.cardReader.isPinCorrect()){
                atm.display.showOptions();
                int option = scan.nextInt();
                switch (option){
                    case 1: atm.display.showBalance();
                        break;
                    case 2: atm.display.showEnteredAmount();
                            atm.output.moneyToWithdraw();
                        break;
                    case 3: atm.display.showEnteredAmount();
                            atm.input.moneyToDeposit();
                        break;
                    default: System.out.println("Invalid option");
                        break;
                }

            }
        }

    }
}
