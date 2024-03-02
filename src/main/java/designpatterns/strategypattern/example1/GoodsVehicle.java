package designpatterns.strategypattern;

import designpatterns.strategypattern.strategy.DriveStrategy;
import designpatterns.strategypattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategy(), "GoodsVehicle");
    }
}
