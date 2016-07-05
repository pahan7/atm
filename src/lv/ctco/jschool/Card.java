package lv.ctco.jschool;

/**
 * Created by Pavel on 7/5/2016.
 */
public class Card {

    private String pin;
    private String name;

    public Card(String pin, String name) {
        this.pin = pin;
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
