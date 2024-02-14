import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Out of a maximum of 45 points accumulated in this class so far, how many points have you recieved so far?");
        double name = input.nextDouble();
        System.out.println(("Your Percentage is:" +(100)*name/45+ "%"));


        double grade = name;

        if (grade < 27.0) {
            System.out.println("You got an F");
        }
        if (grade < 45.0 && grade >= 40.5) {
            System.out.println("You got an A");
        }
        if (grade < 40.5 && grade >= 36.0) {

            System.out.println("You got a B");
        }
        if (grade < 36.0 && grade >= 31.5) {
            System.out.println("You got a C");
        }
        if (grade < 31.5 && grade >= 27) {
            System.out.println("You got a D");
        }
        if (grade == 45) {
            System.out.println("You got an A");
        }

        if (grade >= 45.1) {
            System.out.println("You might have an A, but the max allowable points is 45!");

        }

    }
}
