package KoliKLas;

public class Car extends Vehicle {
    private int kW;

    public Car(int maxSpeed, String model, double price,int kW) {
        super(maxSpeed,model,price);
        this.kW = kW;
    }
    public int getkW() {
        return kW;
    }
    public void setkW(int kW) {
        this.kW = kW;
    }

    @Override
    public double checkPromo() {
        return this.price*0.8;
    }
}
