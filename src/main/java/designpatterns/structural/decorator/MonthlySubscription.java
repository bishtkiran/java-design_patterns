package designpatterns.structural.decorator;

public class MonthlySubscription extends BaseSubscription{

    @Override
    public int cost() {
        return 399;
    }
}
