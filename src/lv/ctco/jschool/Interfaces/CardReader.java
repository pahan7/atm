package lv.ctco.jschool.Interfaces;

/**
 * Created by Pavel on 7/5/2016.
 */
public interface CardReader {

    public boolean isCardInserted(String answer);
    public boolean isPinCorrect(String enteredPin, String cardPin);

}
