package designpatterns.strategypattern.example1;

import designpatterns.strategypattern.example1.strategy.NewDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new NewDriveStrategy(), "OffRoadVehicle");
    }
}
