package lv.ctco.jschool;

import lv.ctco.jschool.Interfaces.*;

/**
 * Created by Pavel on 7/5/2016.
 */
public class ATM {

    CardReader cardReader;
    Display display;
    Input input;
    Output output;
    ServerConnection serverConnection;

    public void readCard(){

    }

    public double depositMoney(double amount){
        double balance = serverConnection.getBankAccount().getBalance();
        serverConnection.getBankAccount().setBalance(balance + amount);
        return amount;

    }

    public double withdrawMoney(double amount){
        double balance = serverConnection.getBankAccount().getBalance();
        serverConnection.getBankAccount().setBalance(balance - amount);
        return amount;
    }

    public void showBalance(double amount){
        display.showBalance(amount);

    }





}
