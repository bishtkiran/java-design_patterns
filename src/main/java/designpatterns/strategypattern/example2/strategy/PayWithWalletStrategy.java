package designpatterns.strategypattern.example2.strategy;

public class PayWithWalletStrategy implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Payment of amount " + amount + " done using Wallet");
    }
}
