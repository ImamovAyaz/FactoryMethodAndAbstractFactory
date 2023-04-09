package Singleton;

import java.util.ArrayList;

// Problem:
//              guarantee single object or n objects
//              global access
//              + (thread safe)
// Solution:
// Encapsulation:
public class DBConnectionSingleton {
    private DBConnectionSingleton(){
        // TODO: Impl me!
        System.out.println("Singleton.DBConnectionSingleton constructor without parameters" + this.toString());
    }

    private static final int capacity = 10;
    private static ArrayList<DBConnectionSingleton> instances;

    static {
        System.out.println("Singleton.DBConnectionSingleton static constructor");
        instances = new ArrayList<>(capacity);
        for(int i = 0; i<capacity; ++i){
            instances.add(new DBConnectionSingleton());
        }
    }

    static DBConnectionSingleton getInstnces(int id){

        System.out.println("Singleton.DBConnectionSingleton getInstnces with id " + id);

        int curID = id;
        if (curID >= capacity){
            curID = capacity-1;
        }

        System.out.println("Updated id " + curID);

        /*
        if(instances.get(curID) == null){
            instances.set(curID, new Singleton.DBConnectionSingleton());
        }

         */
        return instances.get(curID);
    }

    public void createUser(String userName){
        System.out.println("Singleton.DBConnectionSingleton createUser with userName: " + userName);
        connect();
        execute("create user SQL with name " + userName);
    }

    private void connect(){
        System.out.println("Singleton.DBConnectionSingleton connect");
    }

    private void execute(String sql){
        System.out.println("Singleton.DBConnectionSingleton execute with sql: " + sql);
    }
}
