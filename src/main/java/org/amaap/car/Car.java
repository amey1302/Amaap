package org.amaap.car;

import javax.naming.InsufficientResourcesException;

public class Car {

    int fuelCapacity;
    int avg;
    int distanceCovered = 0;
    int distanceEmpty = 0;
    int fuelInLiter = 0;

    Car(int fuelCapacity, int avg) {
        this.fuelCapacity = fuelCapacity;
        this.avg = avg;

    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getAvg() {
        return avg;
    }

    public int getDistanceCovered() {
        return distanceCovered;
    }

    public int getDistanceEmpty() {
        return distanceEmpty;
    }

    public int getFuelInLiter() {
        return fuelInLiter;
    }

    public int refill(int fuel) throws overFlowException {
        if(isFuelOverfilled(fuel,fuelInLiter)){
            fuelInLiter += fuel;

        }
        else{
            throw new overFlowException("Refill is more than Fuel Capacity");
        }


        return fuelInLiter;
    }
    private boolean isFuelOverfilled(int fuel, int fuelInLiter){
        return  (fuelInLiter + fuel) <= fuelCapacity;


    }

    public int distanceToEmpty(int fuelInLiter, int avg) {
        return (fuelInLiter * avg);

    }

    public int drive(int distance) throws InsufficientFuelException {
        int fuelRequired = distance / avg; // 240 / 12 = 20
        if(fuelRequired <= fuelInLiter){
            fuelInLiter -= fuelRequired;
            distanceCovered +=  distance;
        }
        else{
            throw new InsufficientFuelException("Fuel is Enough to Drive "+distanceToEmpty(fuelInLiter,avg) +" km");

        }
        return fuelInLiter;

    }

//    public static void main(String[] args) throws overFlowException {
//        Car car = new Car(40,12);
//        System.out.println(car.getFuelInLiter());
//
//        System.out.println(car.refill(30));
//        System.out.println(car.getDistanceCovered());
//        System.out.println("FuelInLiter after driving 240km : "+car.drive(240)+" l");
//        System.out.println(car.distanceToEmpty(car.getFuelInLiter(), car.getAvg())+" km");
//
//        //System.out.println(car.isFuelOverfilled(100, car.getFuelInLiter()));
//
//
//
//    }
}
