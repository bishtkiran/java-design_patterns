package designpatterns.behavioural.observerpattern;

import designpatterns.behavioural.observerpattern.observable.PhoneObservableImpl;
import designpatterns.behavioural.observerpattern.observable.StockObservable;
import designpatterns.behavioural.observerpattern.observer.EmailAlertNotification;
import designpatterns.behavioural.observerpattern.observer.MobileAlertNotification;
import designpatterns.behavioural.observerpattern.observer.NotificationAlertObserver;

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
