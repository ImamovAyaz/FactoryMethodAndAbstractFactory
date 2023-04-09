package AbstractAndFactoryMethod;

import AbstractAndFactoryMethod.FileEnginesAF.*;
import AbstractAndFactoryMethod.Table.Complex.ComplexAppleTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalAppleTable;
import AbstractAndFactoryMethod.Table.Simple.SimpleAppleTable;
import Singleton.Bank;

import java.util.Random;

public class ConfigurationEngine {
    private ConfigurationEngine() {
        // TODO: Impl me!
        System.out.println("ConfigurationEngine constructor without parameters");
    }

    // If Thread Safe => transform to thread safe
    public static ConfigurationEngine getInstance(){

        System.out.println("ConfigurationEngine getInstance");

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
            switch (generateRandom(4)) {
                case 0:
                    return new MSFileEngineAF();
                case 1:
                    return new AppleFileEngineAf();
                case 2:
                    return new GoogleFileEngineAF();
                case 3:
                    return new IBMFileEngineAF();
                case 4:
                    return new OracleFileEngineAF();
                default:
                    return null;
            }
        }
        return fileEngineAFInstance;
    }

    private static ConfigurationEngine instance;
    private static IFileEngineAF fileEngineAFInstance;

    private int generateRandom(int maxNumber){
        Random random = new Random();
        return random.nextInt(maxNumber);
    }
}
