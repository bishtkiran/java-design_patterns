package designpatterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        DiscountFacade discountFacade = new DiscountFacade();
        discountFacade.applyDiscount( new ApplyDiscountRequest(1L, 1L, 1L));

    }
}
