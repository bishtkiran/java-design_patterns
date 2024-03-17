package designpatterns.creational.singleton;

public class EagerDBConnection {

    private static EagerDBConnection connection_object = new EagerDBConnection();

    private EagerDBConnection(){

    }

    public static EagerDBConnection getConnection(){
        return connection_object;
    }
}
