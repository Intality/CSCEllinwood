import java.util.Scanner;

public class TenMaker {
    public static boolean makes10(double a, double b) {
        return (a + b) == 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        if (makes10(num1, num2)) {
            System.out.println("The numbers " + num1 + " and " + num2 + " add up to 10.");
        } else {
            System.out.println("The numbers " + num1 + " and " + num2 + " do not add up to 10.");
        }
    }
}