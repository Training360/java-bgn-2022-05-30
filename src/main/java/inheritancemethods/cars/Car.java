package inheritancemethods.cars;

public class Car {

    private double fuelRate;

    private double fuel;

    private  double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuelAmount) {
        if (fuelAmount < 0 && fuel < -fuelAmount) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        fuel += fuelAmount;
    }

    public void drive(int km) {
        double fuelNeed = km * fuelRate / 100;
        modifyFuelAmount(-fuelNeed);
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }
}
