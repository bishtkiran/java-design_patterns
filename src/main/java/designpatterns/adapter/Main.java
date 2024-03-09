package designpatterns.adapter;

import designpatterns.adapter.adaptee.WeighingMachineImpl;
import designpatterns.adapter.adapter.WeighingMachineAdapter;
import designpatterns.adapter.adapter.WeighingMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(new WeighingMachineImpl());
        System.out.println("Weight in Kgs :: "+ weighingMachineAdapter.getWeightInKgs());

    }
}
