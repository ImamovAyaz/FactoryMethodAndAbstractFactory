package Singleton;

import Singleton.IDebitCard;

public class DebitCardVisa implements IDebitCard {
    public String getID(){
        return "Some Visa debit card ID";
    }

    public String getVSS(){
        return "Some Visa debit card VSS";
    }
}
