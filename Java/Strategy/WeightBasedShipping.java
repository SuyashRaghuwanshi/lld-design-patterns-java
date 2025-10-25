// Concrete Strategy 2
public class WeightBasedShipping implements ShippingStrategy {
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
