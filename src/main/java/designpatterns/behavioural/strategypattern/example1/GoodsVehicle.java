package designpatterns.behavioural.strategypattern.example1;

import designpatterns.behavioural.strategypattern.example1.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy(), "GoodsVehicle");
    }
}
