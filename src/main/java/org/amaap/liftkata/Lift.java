package org.amaap.liftkata;

import static java.lang.Thread.sleep;

public class Lift {

    private int totalFloor;
    private int maxCapacity;
    private int currentFloor;
    private boolean doorCondition;

    private int liftDirection;

    public boolean dingMessage;


    public Lift(int totalFloor, int maxCapacity) {
        this.totalFloor = totalFloor;
        this.maxCapacity = maxCapacity;
        currentFloor = 0;
        doorCondition = false;
        liftDirection = 1;
        dingMessage = false;

    }

    public int getTotalFloor() {
        return totalFloor;
    }

    public int getLiftDirection() {
        return liftDirection;
    }

    public void setLiftDirection(int liftDirection) {
        this.liftDirection = liftDirection;
    }

//    public void setTotalFloor(int totalFloor) {
//        this.totalFloor = totalFloor;
//    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

//    public void setMaxCapacity(int maxCapacity) {
//        this.maxCapacity = maxCapacity;
//    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public boolean isDoorCondition() {
        return doorCondition;
    }

    public void setDoorCondition(boolean doorCondition) {
        this.doorCondition = doorCondition;
    }


    public void callLift(int sourceFloor, int destinationFloor, int passenger) throws BeyondCapacaityException, InterruptedException {
        if (passenger > maxCapacity) {
            throw new BeyondCapacaityException("Max capacity reached");
        }

        if (sourceFloor > destinationFloor) {
            setLiftDirection(-1);
            liftDirection = -1;
        } else {
            setLiftDirection(1);
            liftDirection = 1;
        }

        setCurrentFloor(sourceFloor);
        if (currentFloor == sourceFloor) {
            setDoorCondition(true);
//            System.out.println("Ding!");
//            System.out.println("Door is Open");

        }

        setDoorCondition(false);
//        System.out.println("Ding!");
//        System.out.println("Door is closed");



        setCurrentFloor(destinationFloor);
        //System.out.println("you have reached destination!");
        if (destinationFloor == currentFloor) {
            dingMessage = true;
        }

    }


    //Todo: Multiple


}
