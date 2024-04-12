import java.util.Scanner;

public class RecursionPractice {

    //Question 1:
    // Recursive method: appendNTimes
    public static String appendNTimes(String SOMEWORD, int REPEAT_RECURSIVE) {
        if (REPEAT_RECURSIVE <= 0) {
            return SOMEWORD;
        }
        return SOMEWORD + appendNTimes(SOMEWORD, REPEAT_RECURSIVE - 1);
    }

    // Iterative method: appendNTimesIterative
    public static String appendNTimesIterative(String SOMEWORD2, int n) {
        StringBuilder result = new StringBuilder(SOMEWORD2);

        /* StringBuilder vs. String
Choose StringBuilder for modifying strings or concatenating strings within loops.
Use String for immutable string values and when thread safety or synchronization is not a concern.
         */


        for (int i = 0; i < n; i++) {
            result.append(SOMEWORD2);
        }
        return result.toString();
    }

    //Question 3:
    // Recursive method: contains
    public static int contains(int[] array, int num, int index) {
        if (index >= array.length) {
            return -1;
        }
        if (array[index] == num) {
            return index;
        }
        return contains(array, num, index + 1);
    }

    // Iterative method: containsIterative
    public static int containsIterative(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
        //Else return -1 as a false.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string for appendNTimes:");
        String inputString = scanner.nextLine();
        System.out.println("Enter the number of times to append: (That is the number of times +1 to be repeated by.)");
        System.out.println("Example: (\"dog\", 4) would return \"dogdogdogdogdog\"\n");
        int times = scanner.nextInt();

        // Call both recursive and iterative appendNTimes
        System.out.println("Recursive Method: " + appendNTimes(inputString, times));
        System.out.println("Iterative Method: " + appendNTimesIterative(inputString, times));

        // Prepare for contains function
        int[] arr = {10, 20, 30, 40, 50}; // Example array
        System.out.println(""); //Spacer for question 3
        System.out.println("Question 3:");
        System.out.println("Enter a number to find in the array (10, 20, 30, 40, 50):");
        System.out.println("If number is not in the array, the result will be -1!");
        int numToFind = scanner.nextInt();

        // Call both recursive and iterative contains
        System.out.println("Recursive contains: Index " + contains(arr, numToFind, 0));
        System.out.println("Iterative containsIterative: Index " + containsIterative(arr, numToFind));

    }
}