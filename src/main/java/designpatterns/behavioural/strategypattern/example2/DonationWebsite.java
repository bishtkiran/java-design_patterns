package designpatterns.behavioural.strategypattern.example2;

import designpatterns.behavioural.strategypattern.example2.strategy.PayWithCardStrategy;

public class DonationWebsite extends Website{

    public DonationWebsite() {
        super(new PayWithCardStrategy());
    }
}
