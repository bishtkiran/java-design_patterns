package designpatterns.strategypattern.example1.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive(String vehicleName) {
        System.out.println(vehicleName + " is driving with normal drive strategy");
    }
}
