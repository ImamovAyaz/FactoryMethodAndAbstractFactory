package AbstractAndFactoryMethod.FileEnginesAF;

import AbstractAndFactoryMethod.AVMsg.IAVMsg;
import AbstractAndFactoryMethod.AVMsg.IBMAVMsg;
import AbstractAndFactoryMethod.Doc.IDoc;
import AbstractAndFactoryMethod.Doc.MSDoc;
import AbstractAndFactoryMethod.Email.IBMEmail;
import AbstractAndFactoryMethod.Email.IEmail;
import AbstractAndFactoryMethod.Msg.IBMMsg;
import AbstractAndFactoryMethod.Msg.IMsg;
import AbstractAndFactoryMethod.Table.Complex.ComplexGoogleTable;
import AbstractAndFactoryMethod.Table.Complex.ComplexIBMTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalGoogleTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalIBMTable;
import AbstractAndFactoryMethod.Table.Simple.SimpleGoogleTable;
import AbstractAndFactoryMethod.Table.Simple.SimpleIBMTable;
import AbstractAndFactoryMethod.Table.ITable;

public class IBMFileEngineAF implements IFileEngineAF {
    public IDoc createDoc() {
        return new MSDoc();
    }

    public ITable createTable() {
        // Homework: Add rand method to get rand number from 0 to 2 and create corresponding Entity
        switch (generateRandom(2)) {
            case 0:
                return new SimpleIBMTable();
            case 1:
                return new ComplexIBMTable();
            case 2:
                return new HierarchicalIBMTable();
            default:
                return null;
        }
    }

    public IEmail createEmail() {
        return new IBMEmail();

    }

    public IMsg createMsg() {
        return new IBMMsg();
    }

    public IAVMsg createAVMsg() {
        return new IBMAVMsg();
    }
}
