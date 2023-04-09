package AbstractAndFactoryMethod.FileEnginesAF;

import AbstractAndFactoryMethod.AVMsg.IAVMsg;
import AbstractAndFactoryMethod.AVMsg.MSAVMsg;
import AbstractAndFactoryMethod.Doc.IDoc;
import AbstractAndFactoryMethod.Doc.MSDoc;
import AbstractAndFactoryMethod.Email.IEmail;
import AbstractAndFactoryMethod.Email.MSEmail;
import AbstractAndFactoryMethod.Msg.IMsg;
import AbstractAndFactoryMethod.Msg.MSMsg;
import AbstractAndFactoryMethod.Table.Complex.ComplexGoogleTable;
import AbstractAndFactoryMethod.Table.Complex.ComplexMSTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalGoogleTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalMSTable;
import AbstractAndFactoryMethod.Table.ITable;
import AbstractAndFactoryMethod.Table.Simple.SimpleGoogleTable;
import AbstractAndFactoryMethod.Table.Simple.SimpleMSTable;

public class MSFileEngineAF implements IFileEngineAF {
    public IDoc createDoc() {
        return new MSDoc();
    }

    public ITable createTable() {
        // Homework: Add rand method to get rand number from 0 to 2 and create corresponding Entity
        switch (generateRandom(2)) {
            case 0:
                return new SimpleMSTable();
            case 1:
                return new ComplexMSTable();
            case 2:
                return new HierarchicalMSTable();
            default:
                return null;
        }
    }

    public IEmail createEmail() {
        return new MSEmail();

    }

    public IMsg createMsg() {
        return new MSMsg();
    }

    public IAVMsg createAVMsg() {
        return new MSAVMsg();
    }
}
