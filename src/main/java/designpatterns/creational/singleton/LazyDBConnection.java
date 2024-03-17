package designpatterns.creational.singleton;

public class LazyDBConnection {

    private static LazyDBConnection lazyDBConnection_object;

    private LazyDBConnection(){

    }

    public static LazyDBConnection getConnection(){
        if(null == lazyDBConnection_object)
            lazyDBConnection_object =  new LazyDBConnection();
        return lazyDBConnection_object;
    }
}
