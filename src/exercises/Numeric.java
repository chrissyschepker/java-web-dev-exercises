package exercises;

import java.util.Scanner;

public class Numeric {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        double area;

        System.out.println("What is the length of the rectangle?");
        length = input.nextDouble();
        System.out.println("What is the width of the rectangle");
        width = input.nextDouble();
        area = (length * width);
        System.out.println("The area of your rectangle is " + area);
    }
}
