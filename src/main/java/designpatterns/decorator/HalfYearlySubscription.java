package designpatterns.decorator;

public class HalfYearlySubscription extends BaseSubscription{

    @Override
    public int cost() {
        return 2400;
    }
}
