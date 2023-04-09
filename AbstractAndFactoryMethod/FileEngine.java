package AbstractAndFactoryMethod;

import AbstractAndFactoryMethod.AVMsg.IAVMsg;
import AbstractAndFactoryMethod.AVMsg.MSAVMsg;
import AbstractAndFactoryMethod.Doc.*;
import AbstractAndFactoryMethod.Email.*;
import AbstractAndFactoryMethod.Msg.IMsg;
import AbstractAndFactoryMethod.Msg.MSMsg;
import AbstractAndFactoryMethod.Table.*;
import AbstractAndFactoryMethod.Table.Complex.*;
import AbstractAndFactoryMethod.Table.Hierarchical.*;
import AbstractAndFactoryMethod.Table.Simple.*;

import java.util.Random;

public class FileEngine {
    private static FileEngine instance;

    private FileEngine() {
        System.out.println("ne.FileEngine constructor without parameters");
    }

    public static FileEngine getInstance() {

        System.out.println("ne.FileEngine getInstance");

        if (instance == null) {
            instance = new FileEngine();
        }
        return instance;
    }

    // NOTE: Factory method #1
    IDoc createDoc() {
        // Homework: Add rand method to get rand number from 0 to 4 and create corresponding Entity
        // генерировалось случ число от 0 до 4 и выводился исходя из этого конкретный тип документа
        switch (generateRandom(4)){
            case 0:
                return new MSDoc();
            case 1:
                return new GoogleDoc();
            case 2:
                return new OracleDoc();
            case 3:
                return new IBMDoc();
            case 4:
                return new AppleDoc();
            default:
                return null;
        }
    }

    // NOTE: Factory method #2
    ITable createTable() {
        // Homework: Add rand method to get rand number from 0 to 14 and create corresponding Entity
        switch (generateRandom(14)){
            case 0:
                return new SimpleMSTable();
            case 1:
                return new SimpleGoogleTable();
            case 2:
                return new SimpleOracleTable();
            case 3:
                return new SimpleIBMTable();
            case 4:
                return new SimpleAppleTable();
            case 5:
                return new ComplexMSTable();
            case 6:
                return new ComplexGoogleTable();
            case 7:
                return new ComplexOracleTable();
            case 8:
                return new ComplexIBMTable();
            case 9:
                return new ComplexAppleTable();
            case 10:
                return new HierarchicalMSTable();
            case 11:
                return new HierarchicalGoogleTable();
            case 12:
                return new HierarchicalOracleTable();
            case 13:
                return new HierarchicalIBMTable();
            case 14:
                return new HierarchicalAppleTable();
            default:
                return null;
        }
    }

    // NOTE: Factory method #3
    IEmail createEmail() {
        // Homework: Add rand method to get rand number from 0 to 4 and create corresponding Entity
        switch (generateRandom(4)){
            case 0:
                return new MSEmail();
            case 1:
                return new GoogleEmail();
            case 2:
                return new OracleEmail();
            case 3:
                return new IBMEmail();
            case 4:
                return new AppleEmail();
            default:
                return null;
        }
    }

    // NOTE: Factory method #4
    IMsg createMsg() {
        // Homework: Add rand method to get rand number from 0 to 4 and create corresponding Entity

        return new MSMsg();
    }

    // NOTE: Factory method #5
    IAVMsg createAVMsg() {
        // Homework: Add rand method to get rand number from 0 to 4 and create corresponding Entity

        return new MSAVMsg();
    }

    private int generateRandom(int maxNumber){
        Random random = new Random();
        return random.nextInt(maxNumber);
    }
}
