import java.util.Scanner;

public class StringKnowledge {

    // Question 1
    public static boolean endOther(String a, String b) {
        // Convert both strings to lowercase for case-insensitive comparison
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        // Check if either string appears at the end of the other
        return lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA);
    }

    // Question 2
    public static boolean findRepeats(String toTest) {
        for (int i = 0; i < toTest.length() - 1; i++) {
            for (int j = i + 2; j <= toTest.length(); j++) {
                String substring = toTest.substring(i, j);
                // Count the occurrences of the substring within the string
                int count = 0;
                int lastIndex = -1;
                while ((lastIndex = toTest.indexOf(substring, lastIndex + 1)) != -1) {
                    count++;
                    // If the substring appears more than once, return true
                    if (count > 1) {
                        return true;
                    }
                }
            }
        } //Closed. But still needs to return false at the end.
        return false;
    } //Closes up the findRepeats method.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question 1
        System.out.println("Question 1: Check if either string appears at the end of the other, regardless of case.");
        System.out.print("Please enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Now please enter the second string: ");
        String str2 = scanner.nextLine();
        System.out.println("The result is : " + endOther(str1, str2));

        // Question 2
        System.out.println("\nQuestion 2: Find duplicates in substrings of length 2 or more. Return true if found; otherwise, return false");
        System.out.print("Enter the string to test: ");
        String testString = scanner.nextLine();
        System.out.println("Result: " + findRepeats(testString));

    }
}
