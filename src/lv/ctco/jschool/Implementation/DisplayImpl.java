package lv.ctco.jschool.Implementation;

import lv.ctco.jschool.Interfaces.Display;

/**
 * Created by Pavel on 7/5/2016.
 */
public class DisplayImpl implements Display {
    @Override
    public void sayHello() {
        System.out.println("Welcome to ATM!");
    }

    @Override
    public void askForCard() {
        System.out.println("Please insert your card. (Y/N");
    }

    @Override
    public void showEnteredPin(String pin) {
        System.out.println("Entered pin: " + pin);
    }

    @Override
    public void showBalance(double balance) {
        System.out.println("Available balance is: " + balance +"eur");
    }

    @Override
    public void showEnteredAmount(double amount) {
        System.out.println("Entered amount: " + amount);
    }

    @Override
    public void showOptions() {
        System.out.println("Choose option below:");
        System.out.println("1: Show balance");
        System.out.println("2: Withdraw money");
        System.out.println("3: Deposit money");
        System.out.println("Enter number of the option you want to do: ");
    }

    @Override
    public void askForPin() {
        System.out.println("Enter your pin: ");
    }

    @Override
    public void askForAmount() {
        System.out.println("Enter amount: " );
    }
}
