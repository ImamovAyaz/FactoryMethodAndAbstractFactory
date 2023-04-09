package Singleton;//import java.util.HashMap;
//import java.util.Scanner;

public class MainBank {
    public static void main(String[] args){
        WebDriverSingleton.getInstance().open("first url");
        WebDriverSingleton.getInstance().open("second url");
        WebDriverSingleton.getInstance().open("first url");
        WebDriverSingleton.getInstance().open("third url");
        WebDriverSingleton.getInstance().open("some other url");

        DBConnectionSingleton.getInstnces(0).createUser("User 1");
        DBConnectionSingleton.getInstnces(0).createUser("User 2");
        DBConnectionSingleton.getInstnces(1).createUser("User 3");
        DBConnectionSingleton.getInstnces(21).createUser("User 4");

        //Singleton.IDebitCard card01 = new Singleton.DebitCardMC();
        //Singleton.IDebitCard card02 = new Singleton.DebitCardMC();
        //Singleton.IDebitCard card03 = new Singleton.DebitCardVisa();

        //Singleton.Bank cityBank = new Singleton.Bank();

        Bank theBank = ConfigurationEngine.getInstance().createBank();
        IDebitCard card04 = theBank.createDebitCard();
        IDebitCard card05 = theBank.createDebitCard();
        IDebitCard card06 = theBank.createDebitCard();
    }
}
