package designpatterns.decorator;

public class Main {

    public static void main(String[] args) {
        MonthlySubscription monthlySubscription = new MonthlySubscription();

        NetflixSubscription netflixSubscription = new NetflixSubscription(monthlySubscription);
        System.out.println("Total cost with netflix subscription "+ netflixSubscription.cost());

        PrimeSubscription primeSubscription = new PrimeSubscription(new AnnualSubscription());
        System.out.println("Total cost with netflix subscription "+ primeSubscription.cost());



    }
}
