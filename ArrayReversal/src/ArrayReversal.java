import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold the numbers
        int[] numbers = new int[100]; // assuming a maximum of 100 numbers
        int count = 0; // to keep track of the number of elements

        // Read in the numbers using a Scanner inside of a loop
        System.out.println("Enter numbers as a whole number. Do not use decimals! (enter -1 to stop):");
        int input = scanner.nextInt();
        while (input != -1) {
            numbers[count] = input; //Take the input and store it in the array
            count++; // increment the count
            input = scanner.nextInt(); // read in the next number
        }

        // Sort the array in descending order
        Arrays.sort(numbers, 0, count);
        // Arrays.sort(numbers, 0, count); But this is the same thing as above!

        // Reverse the sorted array
        int[] reversedNumbers = new int[count];
        for (int i = 0; i < count; i++) {
            reversedNumbers[i] = numbers[count - i - 1];
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedNumbers[i] + " ");
            //Purposely used print() instead of println() so that it prints on only one line!
            //It also looks cleaner this way.
        }
    }

}
