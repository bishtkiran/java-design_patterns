package designpatterns.creational.abstractfactory;

public class AppleMobileFactory extends AbstractFactory{

    @Override
    IMobile getMobile(String model) {
        if (model.equalsIgnoreCase("iphone")) {
            return new Iphone();
        }
        return null;
    }
}
