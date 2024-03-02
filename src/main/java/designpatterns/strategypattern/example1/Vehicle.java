package designpatterns.strategypattern;

import designpatterns.strategypattern.strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;
    private String vehicleName;

    public Vehicle(DriveStrategy driveStrategy, String vehicleName) {
        this.driveStrategy = driveStrategy;
        this.vehicleName = vehicleName;
    }

    void drive(){
        this.driveStrategy.drive(vehicleName);
    }
}
