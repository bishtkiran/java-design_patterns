package designpatterns.strategy;

public class NewDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Driving with new drive strategy");
    }
}
