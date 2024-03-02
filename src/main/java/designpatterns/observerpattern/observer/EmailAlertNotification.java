package designpatterns.observerpattern.observer;

import designpatterns.observerpattern.observable.StockObservable;

public class EmailAlertNotification implements NotificationAlertObserver{

    private String emailId;
    private StockObservable stockObservable;

    public EmailAlertNotification(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Phone In Stock, hurry up!!");

    }

    public void sendMail(String emailId, String message){
        System.out.println(message + " Notification sent to " + emailId);
    }
}
