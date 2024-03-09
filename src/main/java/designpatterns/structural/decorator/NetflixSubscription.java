package designpatterns.structural.decorator;

public class NetflixSubscription extends SubscriptionDecorator{

    BaseSubscription baseSubscription;

    public NetflixSubscription(BaseSubscription baseSubscription) {
        this.baseSubscription = baseSubscription;
    }

    @Override
    public int cost() {
        return this.baseSubscription.cost() + 500;
    }
}
