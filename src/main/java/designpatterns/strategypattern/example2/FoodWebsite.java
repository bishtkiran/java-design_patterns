package designpatterns.strategypattern.example2;

import designpatterns.strategypattern.example2.strategy.PayWithCardStrategy;
import designpatterns.strategypattern.example2.strategy.PaymentStrategy;

public class FoodWebsite extends Website{

    public FoodWebsite() {
        super(new PayWithCardStrategy());
    }
}
