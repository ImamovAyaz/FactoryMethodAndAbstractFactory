package AbstractAndFactoryMethod.FileEnginesAF;

import AbstractAndFactoryMethod.AVMsg.AppleAVMsg;
import AbstractAndFactoryMethod.AVMsg.IAVMsg;
import AbstractAndFactoryMethod.Doc.AppleDoc;
import AbstractAndFactoryMethod.Doc.IDoc;
import AbstractAndFactoryMethod.Email.*;
import AbstractAndFactoryMethod.Msg.AppleMsg;
import AbstractAndFactoryMethod.Msg.IMsg;
import AbstractAndFactoryMethod.Table.Complex.ComplexAppleTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalAppleTable;
import AbstractAndFactoryMethod.Table.ITable;
import AbstractAndFactoryMethod.Table.Simple.SimpleAppleTable;

import java.util.Random;

public class AppleFileEngineAf implements IFileEngineAF {
    public IDoc createDoc() {
        return new AppleDoc();
    }

    public ITable createTable() {
        // Homework: Add rand method to get rand number from 0 to 2 and create corresponding Entity
        switch (generateRandom(2)) {
            case 0:
                return new SimpleAppleTable();
            case 1:
                return new ComplexAppleTable();
            case 2:
                return new HierarchicalAppleTable();
            default:
                return null;
        }
    }

    public IEmail createEmail() {
        return new AppleEmail();

    }

    public IMsg createMsg() {
        return new AppleMsg();
    }

    public IAVMsg createAVMsg() {
        return new AppleAVMsg();
    }
}
