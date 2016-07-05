package lv.ctco.jschool.Interfaces;

/**
 * Created by Pavel on 7/5/2016.
 */
public interface Display {

    public void sayHello();
    public void askForCard();
    public void showEnteredPin(String pin);
    public void showBalance(double balance);
    public void showEnteredAmount(double amount);
    public void showOptions();
    public void askForPin();
    public void askForAmount();
}
