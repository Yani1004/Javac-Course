package Zadacha2;

public class Car {
    protected String brand;
    protected int speed;
    protected double fuel;
    protected int mileage;
    protected double efficiency;

    public Car(String brand, int speed, double fuel, int mileage, double efficiency) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
        this.efficiency = efficiency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public int accelerate() {
        return speed += 10;
    }

    public double refuel() {
        return fuel += 10;
    }

    public void drive(int distance) {
        this.mileage += distance;
        this.fuel -= (efficiency * distance / 100);
    }
}
