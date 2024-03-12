import java.util.Scanner;

public class LogicKnowledge {

    // Question 3
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("You won $20!");
            return 20;
        } else if (a == b || a == c || b == c) {
            System.out.println("You won $10!");
            return 10;
        } else {
            System.out.println("Sorry, not a winner! You won $0!");
            return 0;
        }
    }

    // Question 4

    /*Explanation:
     We need to determine the number of small bars needed to achieve the goal.
     We should use as many large bars as possible before using small bars.
     If it's impossible to achieve the goal using the given number of bars, return -1. */

    /* Math Needed:
    1. Small bars = 1 pound
    2. Large bars = 5 pounds, so goal/5
    3. If we have enough small bars to meet the remaining goal, return the number of small bars used.
    4. If we don't have enough small bars to meet the remaining goal, return -1.
     */

    public static int makeChocolate(int small, int large, int goal) {
        // Calculate how many large bars we can use
        int largeBarsUsed = Math.min(large, goal / 5);
        // Calculate the remaining goal after using large bars
        int remainingGoal = goal - largeBarsUsed * 5;

        // If we have enough small bars to meet the remaining goal, return the number of small bars used
        if (small >= remainingGoal) {
            return remainingGoal;
        } else {
            System.out.println("Not enough small bars to meet the goal");
            return -1;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question 3
        System.out.println("Question 3: Give me 3 numbers, and I'll tell you if you won $20, $10, or $0.");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.println("Result: " + greenTicket(num1, num2, num3));

        // Question 4
        System.out.println("\nQuestion 4: Make Chocolate");
        System.out.print("Enter the number of small chocolate bars: ");
        int smallBars = scanner.nextInt();
        System.out.print("Enter the number of large chocolate bars: ");
        int largeBars = scanner.nextInt();
        System.out.print("Enter the goal number of pounds: ");
        int goalPounds = scanner.nextInt();
        System.out.println("Number of small bars used: " + makeChocolate(smallBars, largeBars, goalPounds));

    }
}
