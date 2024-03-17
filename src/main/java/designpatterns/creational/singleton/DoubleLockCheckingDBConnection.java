package designpatterns.creational.singleton;

public class DoubleLockCheckingDBConnection {

    private static DoubleLockCheckingDBConnection doubleLockCheckingDBConnection;

    private DoubleLockCheckingDBConnection() {

    }

    public static DoubleLockCheckingDBConnection getConnection() {
        if (null == doubleLockCheckingDBConnection) {
            synchronized (DoubleLockCheckingDBConnection.class) {
                if (null == doubleLockCheckingDBConnection) {
                    doubleLockCheckingDBConnection = new DoubleLockCheckingDBConnection();
                }
            }
        }
        return doubleLockCheckingDBConnection;
    }
}
