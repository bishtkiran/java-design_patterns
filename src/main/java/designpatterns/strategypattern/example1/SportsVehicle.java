package designpatterns.strategypattern.example1;

import designpatterns.strategypattern.example1.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy(), "SportsVehicle");
    }
}
