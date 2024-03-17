package designpatterns.creational.singleton;

public class SynchronizedDBConnection {

    private static SynchronizedDBConnection synchronizedDBConnection;

    private SynchronizedDBConnection(){

    }

    synchronized public static SynchronizedDBConnection getConnection(){
        if(null == synchronizedDBConnection)
            synchronizedDBConnection = new SynchronizedDBConnection();
        return synchronizedDBConnection;
    }
}
