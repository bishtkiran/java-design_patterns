package designpatterns.adapter.adapter;

import designpatterns.adapter.adaptee.WeighingMachine;

public class WeighingMachineAdapterImpl implements WeighingMachineAdapter{

    private final WeighingMachine weighingMachine;

    public WeighingMachineAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKgs() {
        double weightInPound = weighingMachine.getWeightInPounds();
        return weightInPound * .45;
    }
}
