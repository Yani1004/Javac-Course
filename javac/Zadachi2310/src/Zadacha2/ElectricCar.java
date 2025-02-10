package Zadacha2;

public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int speed, double fuel, int mileage, double efficiency, int batteryLevel) {
        super(brand, speed, fuel, mileage, efficiency);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(int charging) {
        this.batteryLevel += charging;
    }

    public void driveElectric(int distance) {
        this.batteryLevel -= (int) (this.efficiency * distance / 100);
        this.mileage += distance;
    }
}
