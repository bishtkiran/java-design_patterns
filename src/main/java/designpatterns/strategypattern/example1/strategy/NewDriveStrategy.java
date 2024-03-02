package designpatterns.strategypattern.example1.strategy;

public class NewDriveStrategy implements DriveStrategy {

    @Override
    public void drive(String vehicleName) {
        System.out.println(vehicleName  + " is driving with new drive strategy");
    }
}
