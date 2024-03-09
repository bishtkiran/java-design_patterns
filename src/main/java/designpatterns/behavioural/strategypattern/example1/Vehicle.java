package designpatterns.behavioural.strategypattern.example1;

import designpatterns.behavioural.strategypattern.example1.strategy.DriveStrategy;

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
