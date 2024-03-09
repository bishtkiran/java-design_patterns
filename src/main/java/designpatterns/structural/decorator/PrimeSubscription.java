package designpatterns.structural.decorator;

public class PrimeSubscription extends SubscriptionDecorator{

    BaseSubscription baseSubscription;

    public PrimeSubscription(BaseSubscription baseSubscription) {
        this.baseSubscription = baseSubscription;
    }

    @Override
    public int cost() {
        return this.baseSubscription.cost() + 300;
    }
}
