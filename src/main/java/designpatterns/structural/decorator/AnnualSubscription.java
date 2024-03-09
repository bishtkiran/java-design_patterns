package designpatterns.structural.decorator;

public class AnnualSubscription extends BaseSubscription{

    @Override
    public int cost() {
        return 4199;
    }
}
