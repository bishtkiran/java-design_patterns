package designpatterns.behavioural.strategypattern.example1;

import designpatterns.behavioural.strategypattern.example1.strategy.NewDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new NewDriveStrategy(), "OffRoadVehicle");
    }
}
