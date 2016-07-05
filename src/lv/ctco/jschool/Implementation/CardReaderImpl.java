package lv.ctco.jschool.Implementation;

import lv.ctco.jschool.Interfaces.CardReader;

/**
 * Created by Pavel on 7/5/2016.
 */
public class CardReaderImpl implements CardReader {

    @Override
    public boolean isCardInserted(String answer) {
        if (answer.equals("Y"))
            return true;
        else
            return false;
    }

    @Override
    public boolean isPinCorrect(String enteredPin, String cardPin) {
        if (enteredPin.equals(cardPin))
            return true;
        else
            return false;
    }




}
