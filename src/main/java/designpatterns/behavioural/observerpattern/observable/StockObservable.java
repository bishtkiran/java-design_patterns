package designpatterns.behavioural.observerpattern.observable;

import designpatterns.behavioural.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void register(NotificationAlertObserver observer);

    void unregister(NotificationAlertObserver observer);

    void notifyObservers();

    void setStockCount(int count);

    int getStockCount();

}
