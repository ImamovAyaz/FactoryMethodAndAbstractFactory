package AbstractAndFactoryMethod.FileEnginesAF;

import AbstractAndFactoryMethod.AVMsg.IAVMsg;
import AbstractAndFactoryMethod.Doc.IDoc;
import AbstractAndFactoryMethod.Email.IEmail;
import AbstractAndFactoryMethod.Msg.IMsg;
import AbstractAndFactoryMethod.Table.ITable;

import java.util.Random;

// Homework: Add Interface Impl for MS+, Google, Oracle, IBM and Apple
public interface IFileEngineAF {
    IDoc createDoc();
    ITable createTable();
    IEmail createEmail();
    IMsg createMsg();
    IAVMsg createAVMsg();
    default int generateRandom(int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber);
    }
}
