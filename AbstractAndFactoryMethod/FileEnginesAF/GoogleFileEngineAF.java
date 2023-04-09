package AbstractAndFactoryMethod.FileEnginesAF;

import AbstractAndFactoryMethod.AVMsg.GoogleAVMsg;
import AbstractAndFactoryMethod.AVMsg.IAVMsg;
import AbstractAndFactoryMethod.Doc.GoogleDoc;
import AbstractAndFactoryMethod.Doc.IDoc;
import AbstractAndFactoryMethod.Email.GoogleEmail;
import AbstractAndFactoryMethod.Email.IEmail;
import AbstractAndFactoryMethod.Msg.GoogleMsg;
import AbstractAndFactoryMethod.Msg.IMsg;
import AbstractAndFactoryMethod.Table.Complex.ComplexAppleTable;
import AbstractAndFactoryMethod.Table.Complex.ComplexGoogleTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalAppleTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalGoogleTable;
import AbstractAndFactoryMethod.Table.Simple.SimpleAppleTable;
import AbstractAndFactoryMethod.Table.Simple.SimpleGoogleTable;
import AbstractAndFactoryMethod.Table.ITable;

public class GoogleFileEngineAF implements IFileEngineAF {
    public IDoc createDoc() {
        return new GoogleDoc();
    }

    public ITable createTable() {
        // Homework: Add rand method to get rand number from 0 to 2 and create corresponding Entity
        switch (generateRandom(2)) {
            case 0:
                return new SimpleGoogleTable();
            case 1:
                return new ComplexGoogleTable();
            case 2:
                return new HierarchicalGoogleTable();
            default:
                return null;
        }
    }

    public IEmail createEmail() {
        return new GoogleEmail();

    }

    public IMsg createMsg() {
        return new GoogleMsg();
    }

    public IAVMsg createAVMsg() {
        return new GoogleAVMsg();
    }
}
