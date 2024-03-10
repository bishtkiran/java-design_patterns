package designpatterns.creational.abstractfactory;

public class AndroidMobileFactory extends AbstractFactory{

    @Override
    public IMobile getMobile(String model) {
        if (model.equalsIgnoreCase("OnePlus")) {
            return new OnePlus();
        } else if (model.equalsIgnoreCase("Samsung")) {
            return new Samsung();
        } else if (model.equalsIgnoreCase("Oppo")) {
            return new Oppo();
        }
        return null;
    }
}
