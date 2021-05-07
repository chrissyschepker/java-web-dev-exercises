package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of a circle?");
        double radius = input.nextDouble();
        //double area = (3.14 * radius * radius);
        Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + Circle.getArea(radius));
    }
}
