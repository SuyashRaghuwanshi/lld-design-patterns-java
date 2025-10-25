package parkingLot.vehicle;

public class Car implements Vehicle {
    private String licenseNumber;

    public Car(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }

}
