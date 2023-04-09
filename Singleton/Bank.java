package Singleton;

public class Bank {
    public IDebitCard createDebitCard(){
        return new DebitCardVisa();
    }
}
