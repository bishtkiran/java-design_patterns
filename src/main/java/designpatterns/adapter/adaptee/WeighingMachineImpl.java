package designpatterns.adapter.adaptee;

public class WeighingMachineImpl implements WeighingMachine{

    @Override
    public double getWeightInPounds() {
        return 110;
    }
}
