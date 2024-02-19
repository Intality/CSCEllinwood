import java.util.Scanner;

public class BottlesOfBeer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bottles of Beer program!");
        System.out.print("Enter the starting number of bottles: ");
        int bottles = scanner.nextInt();

        for (int i = bottles; i > 0; i--) {
            if (i == 1) {
                System.out.println(i + " bottle of beer on the wall,");
                System.out.println(i + " bottle of beer!");
            } else {
                System.out.println(i + " bottles of beer on the wall,");
                System.out.println(i + " bottles of beer!");
            }

            System.out.println("Take one down, pass it around,");

            if (i - 1 == 1) {
                System.out.println((i - 1) + " bottle of beer on the wall!\n");
            } else if (i - 1 == 0) {
                System.out.println("No more bottles of beer on the wall!\n");
            } else {
                System.out.println((i - 1) + " bottles of beer on the wall!\n");
            }
        }

        System.out.println("That's the end of the Bottles of Beer program!");
    }
}