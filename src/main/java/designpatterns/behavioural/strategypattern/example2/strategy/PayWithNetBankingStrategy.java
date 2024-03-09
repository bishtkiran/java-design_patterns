package designpatterns.behavioural.strategypattern.example2.strategy;

public class PayWithNetBankingStrategy implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Payment of amount " + amount + " done using Net Banking");
    }
}
