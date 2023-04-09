package AbstractAndFactoryMethod;//import java.util.HashMap;
//import java.util.Scanner;

import AbstractAndFactoryMethod.AVMsg.IAVMsg;
import AbstractAndFactoryMethod.Doc.IDoc;
import AbstractAndFactoryMethod.Email.IEmail;
import AbstractAndFactoryMethod.FileEnginesAF.IFileEngineAF;
import AbstractAndFactoryMethod.Msg.IMsg;
import AbstractAndFactoryMethod.Table.ITable;
import AbstractAndFactoryMethod.Table.Simple.SimpleMSTable;

public class MainBank {
    public static void main(String[] args){
        IDoc docForNewEmployee          = FileEngine.getInstance().createDoc();
        IDoc anotherDocForNewEmployee   = FileEngine.getInstance().createDoc();
        ITable tableForNewEmployee      = FileEngine.getInstance().createTable();
        IEmail emailForNewEmployee      = FileEngine.getInstance().createEmail();
        IMsg msgForNewEmployee          = FileEngine.getInstance().createMsg();
        IAVMsg avmsgForNewEmployee      = FileEngine.getInstance().createAVMsg();

        System.out.println(docForNewEmployee);
        System.out.println(anotherDocForNewEmployee);
        System.out.println(tableForNewEmployee);
        System.out.println(emailForNewEmployee);
        System.out.println(msgForNewEmployee);
        System.out.println(avmsgForNewEmployee);


        IFileEngineAF fileEngineAF = ConfigurationEngine.getInstance().createFileEngineAF();

        IDoc docForNewEmployeeConsystent          = fileEngineAF.createDoc();
        IDoc anotherDocForNewEmployeeConsystent   = fileEngineAF.createDoc();
        ITable tableForNewEmployeeConsystent      = fileEngineAF.createTable();
        IEmail emailForNewEmployeeConsystent      = fileEngineAF.createEmail();
        IMsg msgForNewEmployeeConsystent          = fileEngineAF.createMsg();
        IAVMsg avmsgForNewEmployeeConsystent      = fileEngineAF.createAVMsg();

        System.out.println(docForNewEmployeeConsystent);
        System.out.println(anotherDocForNewEmployeeConsystent);
        System.out.println(tableForNewEmployeeConsystent);
        System.out.println(emailForNewEmployeeConsystent);
        System.out.println(msgForNewEmployeeConsystent);
        System.out.println(avmsgForNewEmployeeConsystent);
    }
}
