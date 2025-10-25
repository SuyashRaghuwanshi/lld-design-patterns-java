// Concrete Strategy 1
public class FlatRateShipping implements ShippingStrategy {
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
