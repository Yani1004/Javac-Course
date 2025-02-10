package KoliKLas;

public class Hovercraft extends Vehicle {
    private int deadweight;

    public Hovercraft(int maxSpeed, String model, double price, int deadweight) {
        super(maxSpeed, model, price);
        this.deadweight = deadweight;

    }


    public int getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(int deadweight) {
        this.deadweight = deadweight;
    }

    @Override
    public double checkPromo() {
        return this.price * 0.97;
    }
}
