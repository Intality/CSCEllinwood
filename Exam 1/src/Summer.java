import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Do I want doubles or integers?
        double sum = 0;
        double num;

        System.out.println("Enter numbers to sum up (enter 0 to finish):");

        while (true) {
            num = scanner.nextDouble();
            if (num == 0) {
                break; // Exit the loop when 0 is entered
            }
            sum += num;
        }
        System.out.println("Sum of all the numbers: " + sum);
    }
}

/* This will be a pickle problem, but doable! So obviously I need a scanner right? Because we're
asking for some input, and then we need to keep adding (summing) until we add some exception: Zero.
So I'm getting Boolean variable vibes, so I need a true/false statement with a break. Section 5.7-5.8
If true, then take a new scanner and keep adding those numbers. so sum+= num which is all entered #'s.
If false (or entered zero), print sum. OK, but do I need an if/else statement? If/break might work.
Look at Week 5's lecture 20ish minutes in about break and continue. OK I just had an ah-ha moment!
OK program works, and pickle solved!
 */