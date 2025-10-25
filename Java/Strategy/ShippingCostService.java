
// Context class
public class ShippingCostService {
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
