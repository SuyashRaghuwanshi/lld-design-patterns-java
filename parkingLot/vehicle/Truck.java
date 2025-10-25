package parkingLot.vehicle;

public class Truck {
    private String licenseNumber;

    public Truck(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public String getVehicleType() {
        return "Truck";
    }
}
