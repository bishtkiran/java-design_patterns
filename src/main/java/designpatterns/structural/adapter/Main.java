package designpatterns.structural.adapter;

import designpatterns.structural.adapter.adaptee.WeighingMachineImpl;
import designpatterns.structural.adapter.adapter.WeighingMachineAdapter;
import designpatterns.structural.adapter.adapter.WeighingMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(new WeighingMachineImpl());
        System.out.println("Weight in Kgs :: "+ weighingMachineAdapter.getWeightInKgs());

    }
}
