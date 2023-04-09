package AbstractAndFactoryMethod.FileEnginesAF;

import AbstractAndFactoryMethod.AVMsg.IAVMsg;
import AbstractAndFactoryMethod.AVMsg.OracleAVMsg;
import AbstractAndFactoryMethod.Doc.IDoc;
import AbstractAndFactoryMethod.Doc.OracleDoc;
import AbstractAndFactoryMethod.Email.IEmail;
import AbstractAndFactoryMethod.Email.OracleEmail;
import AbstractAndFactoryMethod.Msg.IMsg;
import AbstractAndFactoryMethod.Msg.OracleMsg;
import AbstractAndFactoryMethod.Table.Complex.ComplexGoogleTable;
import AbstractAndFactoryMethod.Table.Complex.ComplexOracleTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalGoogleTable;
import AbstractAndFactoryMethod.Table.Hierarchical.HierarchicalOracleTable;
import AbstractAndFactoryMethod.Table.ITable;
import AbstractAndFactoryMethod.Table.Simple.SimpleGoogleTable;
import AbstractAndFactoryMethod.Table.Simple.SimpleOracleTable;

public class OracleFileEngineAF implements IFileEngineAF {
    public IDoc createDoc() {
        return new OracleDoc();
    }

    public ITable createTable() {
        // Homework: Add rand method to get rand number from 0 to 2 and create corresponding Entity
        switch (generateRandom(2)) {
            case 0:
                return new SimpleOracleTable();
            case 1:
                return new ComplexOracleTable();
            case 2:
                return new HierarchicalOracleTable();
            default:
                return null;
        }
    }

    public IEmail createEmail() {
        return new OracleEmail();

    }

    public IMsg createMsg() {
        return new OracleMsg();
    }

    public IAVMsg createAVMsg() {
        return new OracleAVMsg();
    }
}
