package designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory androidFactory = MobileFactoryProducer.getFactory(false);
        IMobile onePlus = androidFactory.getMobile("OnePlus");
        onePlus.brandName();
        IMobile sony = androidFactory.getMobile("Samsung");
        sony.brandName();
        IMobile lava = androidFactory.getMobile("Oppo");
        lava.brandName();
        AbstractFactory iPhoneFactory = MobileFactoryProducer.getFactory(true);
        IMobile iphone = iPhoneFactory.getMobile("iPhone");
        iphone.brandName();
    }
}
