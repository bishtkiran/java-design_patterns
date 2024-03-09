package designpatterns.behavioural.strategypattern.example2;

import designpatterns.behavioural.strategypattern.example2.strategy.PayWithCardStrategy;

public class FoodWebsite extends Website{

    public FoodWebsite() {
        super(new PayWithCardStrategy());
    }
}
