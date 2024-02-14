import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();

        // Calculate the circumference, area, and diameter after entering radius!
        double circumference = circumference(radius);
        double area = area(radius);
        double diameter = diameter(radius);

        // Print the results
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("The area of the circle is: " + area);
        System.out.println("The diameter of the circle is: " + diameter);
    }

    // Method to calculate the circumference of a circle
    public static double circumference(double radius) {

        return 2 * Math.PI * radius;
    }

    // Method to calculate the area of a circle
    public static double area(double radius) {

        return Math.PI * radius * radius;
    }

    // Method to calculate the diameter of a circle
    public static double diameter(double radius) {

        return 2 * radius;
    }
}
