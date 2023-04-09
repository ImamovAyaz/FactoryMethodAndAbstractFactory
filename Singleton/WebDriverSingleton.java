package Singleton;

// Problem:
//              guarantee single object or n objects
//              global access
//              + (thread safe)
// Solution:
// Encapsulation:
public class WebDriverSingleton {
    private WebDriverSingleton() {
        // TODO: Impl me!
        System.out.println("Singleton.WebDriverSingleton constructor without parameters");
    }

    // If Thread Safe => transform to thread safe
    public static WebDriverSingleton getInstance(){

        System.out.println("Singleton.WebDriverSingleton getInstance");

        if (instance == null){
            instance = new WebDriverSingleton();
        }
        return instance;
    }

    public void open(String url){
        System.out.println("Singleton.WebDriverSingleton open with url: " + url);
    }

    private static WebDriverSingleton instance;
}
