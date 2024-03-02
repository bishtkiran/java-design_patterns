package designpatterns.strategypattern.example2;

import designpatterns.strategypattern.example2.strategy.PaymentStrategy;

public class Website {

    private PaymentStrategy paymentStrategy;

    public Website(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount){
        paymentStrategy.pay(amount);
    }
}
