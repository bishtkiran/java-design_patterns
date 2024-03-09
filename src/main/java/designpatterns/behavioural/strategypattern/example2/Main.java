package designpatterns.behavioural.strategypattern.example2;

public class Main {

    public static void main(String[] args) {

        DonationWebsite donationWebsite = new DonationWebsite();
        donationWebsite.pay(5000);

        ShoppingWebsite shoppingWebsite = new ShoppingWebsite();
        shoppingWebsite.pay(1000);

        TravelWebsite travelWebsite = new TravelWebsite();
        travelWebsite.pay(2000);

        FoodWebsite foodWebsite = new FoodWebsite();
        foodWebsite.pay(5000);


    }
}
