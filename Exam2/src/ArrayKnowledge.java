import java.util.Scanner;
import java.util.Arrays;

public class ArrayKnowledge {

    // IMPORTANT: DON'T FORGET import java.util.Arrays; at the top of the file!

    // Question 5
    public static char[] stringToArray(String str) {
        char[] charArray = new char[str.length()]; // length of the array is the length of the string
        for (int i = 0; i < str.length(); i++) { // loop through the string
            charArray[i] = str.charAt(i); // add each character to the array
        }
        return charArray; // return the array
    }

    // Question 6
    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int length = (end - start + step - 1) / step; // calculate the length of the array
        int[] resultArray = new int[length]; // create the array with the calculated length
        for (int i = 0; i < length; i++) { // loop through the array
            resultArray[i] = start + i * step; // add each number to the array
        }
        return resultArray; // return the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question 5
        System.out.println("Question 5: Enter a word or sentence (String), and I will convert it to an array of characters:");
        System.out.print("Please enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("stringToArray(\"" + inputString + "\") -> " + Arrays.toString(stringToArray(inputString)));
        //Need \inputString\ in backslash to print the string correctly in the console
        // because it is a string and not a char array.

        // Question 6
        System.out.println("\nQuestion 6: Give me a start, end, and step value, and I will generate an array of numbers:");
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();
        System.out.print("Enter step number. That is, the amount by which the numbers will be incremented by: ");
        int step = scanner.nextInt();
        System.out.println("generateArrayWithBounds(" + start + ", " + end + ", " + step + ") → " + Arrays.toString(generateArrayWithBounds(start, end, step)));

        scanner.close();
    }
}
