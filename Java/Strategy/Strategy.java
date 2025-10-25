package Java.Strategy;

// Strategy pattern example for calculating shipping cost
public class Strategy{

    // Context class
    static class ShippingCostService {
        private ShippingStrategy strategy;

        public ShippingCostService(ShippingStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(ShippingStrategy strategy) {
            this.strategy = strategy;
        }

        public double calculateCost(Order order) {
            return strategy.calculateShippingCost(order);
        }
    }

    // Strategy interface
    interface ShippingStrategy {
        double calculateShippingCost(Order order);
    }

    // Concrete Strategy 1
    static class FlatRateShipping implements ShippingStrategy {
        private final double flatRate;

        public FlatRateShipping(double flatRate) {
            this.flatRate = flatRate;
        }

        @Override
        public double calculateShippingCost(Order order) {
            System.out.println("Calculating with Flat Rate strategy ($" + flatRate + ")");
            return flatRate;
        }
    }

    // Concrete Strategy 2
    static class WeightBasedShipping implements ShippingStrategy {
        private final double ratePerKg;

        public WeightBasedShipping(double ratePerKg) {
            this.ratePerKg = ratePerKg;
        }

        @Override
        public double calculateShippingCost(Order order) {
            System.out.println("Calculating with Weight Based strategy ($" + ratePerKg + " per kg)");
            return order.getWeight() * ratePerKg;
        }
    }

    // Model class
    static class Order {
        private final double weight;

        public Order(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }
    }

    // Client
    public static void main(String[] args) {
        Order order = new Order(10); // 10 kg order

        ShippingCostService shippingService = new ShippingCostService(new FlatRateShipping(50));
        System.out.println("Shipping Cost: $" + shippingService.calculateCost(order));

        shippingService.setStrategy(new WeightBasedShipping(5)); // $5 per kg
        System.out.println("Shipping Cost: $" + shippingService.calculateCost(order));
    }
}
