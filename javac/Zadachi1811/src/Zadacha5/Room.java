package Zadacha5;

public class Room {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    private int availableNights;

    public Room(String roomNumber, String roomType, double pricePerNight, int availableNights) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.availableNights = availableNights;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getAvailableNights() {
        return availableNights;
    }

    public void setAvailableNights(int availableNights) {
        this.availableNights = availableNights;
    }
    public boolean reserveRoom(int numNights) throws NoAvailableNightsException{
        availableNights-=numNights;
        if(availableNights<0){
            throw new NoAvailableNightsException();
        }else{
            return true;
        }

    }
}
