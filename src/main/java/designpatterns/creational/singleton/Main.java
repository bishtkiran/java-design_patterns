package designpatterns.creational.singleton;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        /* Eager Initialization*/
        EagerDBConnection eagerDBConnection = EagerDBConnection.getConnection();
        EagerDBConnection new_eagerDBConnection = EagerDBConnection.getConnection();
        System.out.println("Eager Connection Object " + eagerDBConnection.hashCode());
        System.out.println("New eager DBConnection object " + new_eagerDBConnection.hashCode());

        /* Lazy Initialization*/
        LazyDBConnection lazyDBConnection = LazyDBConnection.getConnection();
        LazyDBConnection new_lazyDBConnection = LazyDBConnection.getConnection();
        System.out.println("Lazy Connection Object " + lazyDBConnection.hashCode());
        System.out.println("New Lazy Connection Object " + new_lazyDBConnection.hashCode());

        /* Synchronzied Initialization*/
        SynchronizedDBConnection synchronizedDBConnection = SynchronizedDBConnection.getConnection();
        SynchronizedDBConnection new_synchronizedDBConnection = SynchronizedDBConnection.getConnection();
        System.out.println("Synchronized Connection Object " + synchronizedDBConnection.hashCode());
        System.out.println("New Synchronized Connection Object " + new_synchronizedDBConnection.hashCode());


        /* Double lock checking Synchronzied Initialization*/
        DoubleLockCheckingDBConnection doubleLockCheckingDBConnection = DoubleLockCheckingDBConnection.getConnection();
        DoubleLockCheckingDBConnection new_doubleLockCheckingDBConnection = DoubleLockCheckingDBConnection.getConnection();
        System.out.println("Double lock Synchronized Connection Object " + doubleLockCheckingDBConnection.hashCode());
        System.out.println("New double lock Synchronized Connection Object " + new_doubleLockCheckingDBConnection.hashCode());


    }
}
