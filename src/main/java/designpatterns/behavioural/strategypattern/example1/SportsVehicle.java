package designpatterns.behavioural.strategypattern.example1;

import designpatterns.behavioural.strategypattern.example1.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy(), "SportsVehicle");
    }
}
