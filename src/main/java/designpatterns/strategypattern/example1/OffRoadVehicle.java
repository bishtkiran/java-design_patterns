package designpatterns.strategypattern;

import designpatterns.strategypattern.strategy.DriveStrategy;
import designpatterns.strategypattern.strategy.NewDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new NewDriveStrategy(), "OffRoadVehicle");
    }
}
