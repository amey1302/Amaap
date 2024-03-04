package org.amaap.liftkata;

import java.util.Scanner;

public class LiftApp {
    public static void main(String[] args) throws BeyondCapacaityException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Lift lift = new Lift(5, 8);
        System.out.println("Select from Menu\n1.Use a Lift\n2.Use Steps");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Select from Below:\n1.Call the Lift\n2.Current Floor");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("On which floor you are??");
                    int sourceFloor = scanner.nextInt();
                    System.out.println("Which Floor you want to go?");
                    int destinationFloor = scanner.nextInt();
                    System.out.println("No of Passengers?");
                    int passengers = scanner.nextInt();
                    lift.callLift(sourceFloor,destinationFloor,passengers);
                    break;
                case 2:
                    System.out.println("Current Floor is : " +lift.getCurrentFloor());
                    break;

            }
        }
    }
}
