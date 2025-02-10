package KoliKLas;

public class Ship  extends Vehicle{
    private int passengers;

    public Ship(int maxSpeed, String model, double price,int passengers) {
        super(maxSpeed, model, price);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    @Override
    public double checkPromo() {
        return this.price * 0.997;
    }
}
