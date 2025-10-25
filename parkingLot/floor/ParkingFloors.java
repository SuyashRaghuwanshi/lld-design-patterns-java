package parkingLot.floor;

public class ParkingFloors {
    private int floorNumber;
    private int totalSpots;
    private int availableSpots;
    // Constructors, getters, and setters
    public int getFloorNumber() {
        return floorNumber;
    }
    public int gettotalSpots(){
        return totalSpots;
    }
    public int availableSpots(){
        return availableSpots;
    }
    public void setFloorNumber(int floorNumber){
        this.floorNumber = floorNumber;
    }
    public void setTotalSpots(int totalSpots){
        this.totalSpots = totalSpots;
    }
    public void setAvailableSpots(int availableSpots){
        this.availableSpots = availableSpots;
    }
}
