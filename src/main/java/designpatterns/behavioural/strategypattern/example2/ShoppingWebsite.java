package designpatterns.behavioural.strategypattern.example2;

import designpatterns.behavioural.strategypattern.example2.strategy.PayWithWalletStrategy;

public class ShoppingWebsite extends Website{

    public ShoppingWebsite() {
        super(new PayWithWalletStrategy());
    }
}
