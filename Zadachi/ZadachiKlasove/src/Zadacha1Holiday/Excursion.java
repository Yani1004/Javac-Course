package Zadacha1Holiday;


public class Excursion extends Journey implements NumberOfDays{
    private int numberOfHotels;

    public Excursion(String destination, int durationDays, double price, int numberOfHotels) {
        super(destination, durationDays, price);
        this.numberOfHotels = numberOfHotels;
    }


    public int getNumberOfHotels() {
        return numberOfHotels;
    }

    public void setNumberOfHotels(int numberOfHotels) {
        this.numberOfHotels = numberOfHotels;
    }
    @Override
    public void fixPrice(double price) {
        this.price=price*1.1;
    }

    @Override
    public int getNumberOfDays() {
        return this.durationDays-1;
    }
}
