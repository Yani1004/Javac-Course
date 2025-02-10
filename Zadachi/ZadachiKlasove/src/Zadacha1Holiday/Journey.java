package Zadacha1Holiday;

abstract class Journey {
    protected String destination;
    protected int durationDays;
    protected double price;
    public Journey(String destination, int durationDays, double price) {
        this.destination = destination;
        this.durationDays = durationDays;
        this.price = price;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public int getDurationDays() {
        return durationDays;
    }
    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void fixPrice(double price);
}
