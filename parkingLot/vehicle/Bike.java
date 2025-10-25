package parkingLot.vehicle;

public class Bike implements Vehicle {
    private String licenseNumber;

    public Bike(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }

}
