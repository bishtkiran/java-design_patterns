package designpatterns.behavioural.observerpattern.observable;

import designpatterns.behavioural.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneObservableImpl implements StockObservable{

    int stockCount = 0;

    List<NotificationAlertObserver> observers = new ArrayList<>();

    @Override
    public void register(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(NotificationAlertObserver::update);

    }

    @Override
    public void setStockCount(int count) {
        if(stockCount == 0)
            notifyObservers();
        this.stockCount = stockCount + count;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
