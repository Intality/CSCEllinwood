import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many points have you received so far?");
        double grade = input.nextDouble();

        if (grade >= 92) {
            System.out.println("You got an A");
        } else if (grade >= 89.0) {
            System.out.println("You got an A-");
        } else if (grade >= 87.0) {
            System.out.println("You got a B+");
        } else if (grade >= 82.0) {
            System.out.println("You got a B");
        } else if (grade >= 79.0) {
            System.out.println("You got a B-");
        } else if (grade >= 77.0) {
            System.out.println("You got a C+");
        } else if (grade >= 72.0) {
            System.out.println("You got a C");
        } else if (grade >= 69.0) {
            System.out.println("You got a C-");
        } else if (grade >= 67.0) {
            System.out.println("You got a D+");
        } else if (grade >= 60.0) {
            System.out.println("You got a D");
        } else if (grade <= 0) {
            System.out.println("Invalid Entry! Number of points must be greater than zero!");

        } else {
            System.out.println("You got an F");
        }
    }
}