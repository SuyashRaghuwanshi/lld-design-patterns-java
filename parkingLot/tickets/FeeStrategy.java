package parkingLot.tickets;

public class FeeStrategy {
    String vehicleType;
    double hourlyRate;
    public FeeStrategy(String vehicleType, double hourlyRate){
        this.vehicleType = vehicleType;
        this.hourlyRate = hourlyRate;
    }
    public double calculateFee(String vehicleType,int hoursParked){
        switch (vehicleType) {
            case "Car":
                this.hourlyRate = 10.0;
                break;
            case "Bike":
                this.hourlyRate = 5.0;
                break;
            case "Truck":
                this.hourlyRate = 15.0;
                break;
        }
        return hoursParked * hourlyRate;
    }
}
