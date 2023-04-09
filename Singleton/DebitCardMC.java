package Singleton;

import Singleton.IDebitCard;

public class DebitCardMC implements IDebitCard {
    public String getID(){
        return "Some MC debit card ID";
    }

    public String getVSS(){
        return "Some MC debit card VSS";
    }
}
