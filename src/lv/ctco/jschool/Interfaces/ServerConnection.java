package lv.ctco.jschool.Interfaces;

import lv.ctco.jschool.BankAccount;

/**
 * Created by Pavel on 7/5/2016.
 */
public interface ServerConnection {

    public BankAccount getBankAccount();
    public void updateBankAccount(BankAccount bankAccount, double amount);
}
