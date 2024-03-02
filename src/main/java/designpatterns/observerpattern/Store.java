package designpatterns.observerpattern;

import designpatterns.observerpattern.observable.PhoneObservableImpl;
import designpatterns.observerpattern.observable.StockObservable;
import designpatterns.observerpattern.observer.EmailAlertNotification;
import designpatterns.observerpattern.observer.MobileAlertNotification;
import designpatterns.observerpattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StockObservable phoneObservable = new PhoneObservableImpl();

        NotificationAlertObserver emailAlertNotification = new EmailAlertNotification("kiran.bisht@gmail.com", phoneObservable);
        NotificationAlertObserver emailAlertNotification2 = new EmailAlertNotification("bisht.kiran@gmail.com", phoneObservable);
        NotificationAlertObserver mobileAlertNotification = new MobileAlertNotification("Kiran", phoneObservable);

        phoneObservable.register(emailAlertNotification);
        phoneObservable.register(emailAlertNotification2);
        phoneObservable.register(mobileAlertNotification);

        phoneObservable.setStockCount(20);


    }
}
