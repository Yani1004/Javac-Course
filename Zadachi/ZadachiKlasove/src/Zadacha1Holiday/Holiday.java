package Zadacha1Holiday;

public class Holiday extends Journey {
    private String hotelName;

    public Holiday(String destination, int durationDays, double price, String hotelName) {
        super(destination, durationDays, price);
        this.hotelName = hotelName;
    }


    @Override
    public void fixPrice(double price) {
        this.price=price*1.4;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
