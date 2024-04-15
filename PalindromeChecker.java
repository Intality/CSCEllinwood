import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Initialize two pointers
        int left = 0;
        int right = str.length() - 1;

        // Iterate over the string using two pointers
        while (left < right) {
            // Compare characters at left and right pointers
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The entered string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The entered string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
