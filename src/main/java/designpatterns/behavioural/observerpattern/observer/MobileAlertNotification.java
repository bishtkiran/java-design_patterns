package designpatterns.behavioural.observerpattern.observer;

import designpatterns.behavioural.observerpattern.observable.StockObservable;

public class MobileAlertNotification implements NotificationAlertObserver{

    private String userName;
    private StockObservable stockObservable;

    public MobileAlertNotification(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Phone is in stock hurry up!!");

    }

    public void sendMessageOnMobile(String username, String message){
        System.out.println(message + " Notification sent to user " + username);
    }
}
