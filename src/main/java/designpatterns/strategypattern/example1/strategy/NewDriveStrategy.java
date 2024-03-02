package designpatterns.strategypattern.strategy;

import designpatterns.strategypattern.strategy.DriveStrategy;

public class NewDriveStrategy implements DriveStrategy {

    @Override
    public void drive(String vehicleName) {
        System.out.println(vehicleName  + " is driving with new drive strategy");
    }
}
