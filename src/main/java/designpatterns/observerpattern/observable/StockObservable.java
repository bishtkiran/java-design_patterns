package designpatterns.observerpattern.observable;

import designpatterns.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void register(NotificationAlertObserver observer);

    void unregister(NotificationAlertObserver observer);

    void notifyObservers();

    void setStockCount(int count);

    int getStockCount();

}
