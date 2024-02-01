import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Where are you from?");
        String location = input.nextLine();

        System.out.println("What is your favorite thing to do?");
        String favorite = input.nextLine();

        //Personal Note: To run nicely, have all stings run first before ints. This will help with the Scanner Bugs.

        System.out.println("What is your age?");
        int age = input.nextInt();

        System.out.println("How much would you like to donate today? (Please enter an amount without  $ symbol)");
        int donate = input.nextInt();

        // HOw can I find a way to have it  accept decimals?

        System.out.println("Hello, " + name + " from " + location + "! You are " + age + " years old today! \uD83C\uDF82" );
        // \uD83C\uDF82 is the 🎂 Emoji!

        System.out.println("I hope you have fun the next time you play/do: " + favorite);
        System.out.println("You have donated $" +donate + " today!");

    }
}