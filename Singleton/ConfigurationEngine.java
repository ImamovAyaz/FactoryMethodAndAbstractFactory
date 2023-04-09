package Singleton;

import AbstractAndFactoryMethod.FileEnginesAF.IFileEngineAF;
import AbstractAndFactoryMethod.FileEnginesAF.MSFileEngineAF;

public class ConfigurationEngine {
    private ConfigurationEngine() {
        // TODO: Impl me!
        System.out.println("ne.ConfigurationEngine constructor without parameters");
    }

    // If Thread Safe => transform to thread safe
    public static ConfigurationEngine getInstance(){

        System.out.println("ne.ConfigurationEngine getInstance");

        if (instance == null){
            instance = new ConfigurationEngine();
        }
        return instance;
    }

    public Bank createBank(){
        // TODO: Add complex logic and possibly add parameters (Сложная логика создания банка, мб с доп. параметрами)
        return new Bank();
    }

    public IFileEngineAF createFileEngineAF(){
        if (fileEngineAFInstance == null){
            // Homework: Add rand method to get rand number from 0 to 4 and create corresponding Entity
            fileEngineAFInstance = new MSFileEngineAF();
        }
        return fileEngineAFInstance;
    }

    private static ConfigurationEngine instance;
    private static IFileEngineAF fileEngineAFInstance;
}
