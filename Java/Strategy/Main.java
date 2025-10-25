// Client code to demonstrate Strategy Pattern
public class Main {
    public static void main(String[] args) {
        Order order = new Order(10); // 10 kg order

        ShippingCostService shippingService = new ShippingCostService(new FlatRateShipping(50));
        System.out.println("Shipping Cost: $" + shippingService.calculateCost(order));

        shippingService.setStrategy(new WeightBasedShipping(5)); // $5 per kg
        System.out.println("Shipping Cost: $" + shippingService.calculateCost(order));
    }
}
