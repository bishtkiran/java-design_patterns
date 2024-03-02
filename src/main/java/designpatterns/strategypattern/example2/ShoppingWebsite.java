package designpatterns.strategypattern.example2;

import designpatterns.strategypattern.example2.strategy.PayWithWalletStrategy;
import designpatterns.strategypattern.example2.strategy.PaymentStrategy;

public class ShoppingWebsite extends Website{

    public ShoppingWebsite() {
        super(new PayWithWalletStrategy());
    }
}
