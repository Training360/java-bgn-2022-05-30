package inheritancemethods.cars;

public class Jeep extends Car {

    private double extraCapacity;

    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + (extraCapacity - extraFuel);
    }


    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuelAmount) {

        if (-fuelAmount >= extraFuel) {
            double fuelAmountLeft = fuelAmount + extraFuel;
            extraFuel = 0;
            super.modifyFuelAmount(fuelAmountLeft);
        }
        else {
            extraFuel -= fuelAmount;
        }
    }
}
