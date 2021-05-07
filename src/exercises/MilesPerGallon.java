package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input;
        double milesDriven;
        double gallonsConsumed;
        double milesPerGallon;

        input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        milesDriven = input.nextDouble();
        System.out.println("how many gallons of gas have you consumed?");
        gallonsConsumed = input.nextDouble();
        milesPerGallon = (milesDriven / gallonsConsumed);
        System.out.println("You get " + milesPerGallon + " Miles Per Gallon");
    }
}
