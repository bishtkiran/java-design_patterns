package designpatterns.behavioural.strategypattern.example2;

import designpatterns.behavioural.strategypattern.example2.strategy.PayWithUPIStrategy;

public class TravelWebsite extends Website{

    public TravelWebsite() {
        super(new PayWithUPIStrategy());
    }
}
