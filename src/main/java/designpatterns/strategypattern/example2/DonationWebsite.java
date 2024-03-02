package designpatterns.strategypattern.example2;

import designpatterns.strategypattern.example2.strategy.PayWithCardStrategy;
import designpatterns.strategypattern.example2.strategy.PaymentStrategy;

public class DonationWebsite extends Website{

    public DonationWebsite() {
        super(new PayWithCardStrategy());
    }
}
