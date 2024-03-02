package designpatterns.strategypattern.example2;

import designpatterns.strategypattern.example2.strategy.PayWithUPIStrategy;
import designpatterns.strategypattern.example2.strategy.PaymentStrategy;

public class TravelWebsite extends Website{

    public TravelWebsite() {
        super(new PayWithUPIStrategy());
    }
}
