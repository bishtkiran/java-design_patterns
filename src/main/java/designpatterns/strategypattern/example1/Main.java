package designpatterns.strategypattern;

public class Main {

    public static void main(String[] args) {

        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();

        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();

    }
}
