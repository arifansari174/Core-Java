// Step 1: Create an interface
interface Market {
    void buy();   // abstract method
    void sell();  // abstract method
}

// Step 2: Implement the interface in a class
class SuperMarket implements Market {
    @Override
    public void buy() {
        System.out.println("Buying goods from the supermarket.");
    }

    @Override
    public void sell() {
        System.out.println("Selling goods in the supermarket.");
    }
}

// Step 3: Main class to test
public class MarketExample {
    public static void main(String[] args) {
        Market market = new SuperMarket();
        
        market.buy();
        market.sell();
    }
}