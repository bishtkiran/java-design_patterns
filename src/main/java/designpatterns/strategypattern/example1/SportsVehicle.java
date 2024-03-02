package designpatterns.strategypattern;

import designpatterns.strategypattern.strategy.DriveStrategy;
import designpatterns.strategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportsDriveStrategy(), "SportsVehicle");
    }
}
