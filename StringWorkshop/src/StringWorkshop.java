import java.util.Scanner;

public class StringWorkshop {


    //We need a scanner since we're asking for input on the menu!
    public static Scanner scanner = new Scanner(System.in);
    public static String inputString;

    public static void main(String[] args) {
        System.out.print("Enter a starting string: ");
        inputString = scanner.nextLine();
        boolean programrun = true;

          /* nextLine(): This method reads the input as a string,
        including whitespace, until the user presses the Enter key.
        It reads the entire line, including any leading or trailing whitespace.

        Whitespace refers to any character that represents horizontal or vertical space in typography.
        In programming, whitespace generally refers to characters that are used for spacing but don't
         display visibly on the screen when printed.
         */

        while (programrun) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            //Create if/else statements based upon menu choices. Could possibly create classes and call them!

            if (choice == 1) {
                addContent();
            } else if (choice == 2) {
                containsSubstring();
            } else if (choice == 3) {
                outputLength();
            } else if (choice == 4) {
                outputSubstringAfterPrefix();
            } else if (choice == 5) {
                outputSubstringBeforeSuffix();
            } else if (choice == 6) {
                outputSubstringBeforeAndAfterPrefixAndSuffix();
            } else if (choice == 7) {
                exitProgram();
                programrun = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayMenu() {
        //Now we need to create the menu since we're calling it in the while loop.
        System.out.println("\nMenu:");
        System.out.println("1. Add more content to the string");
        System.out.println("2. Check if a string contains a substring");
        System.out.println("3. Output the length of the string");
        System.out.println("4. Output the substring after a given prefix");
        System.out.println("5. Output the substring before a given suffix");
        System.out.println("6. Output the substring before and after a given prefix and suffix");
        System.out.println("7. Exit the program");
        System.out.print("Enter your choice: ");
    }

    ///Now create classes for the if/else.
    public static void addContent() { //Choice 1
        System.out.print("Enter content to add: ");
        String content = scanner.nextLine();
        inputString += content;
        System.out.println("String after addition: " + inputString);
    }

    public static void containsSubstring() { //Choice 2
        System.out.print("Enter substring to check: ");
        String substring = scanner.nextLine();
        boolean contains = inputString.contains(substring);
        //Need boolean because it's essentially a true/false statement

        if (contains) {
            System.out.println("String contains the substring.");
        } else {
            System.out.println("String does not contain the substring.");
        }
    }

    public static void outputLength() { //Choice 3

        System.out.println("Length of the string: " + inputString.length());
    }

    public static void outputSubstringAfterPrefix() { //Choice 4
        System.out.print("Enter prefix: ");
        String prefix = scanner.nextLine();
        int index = inputString.indexOf(prefix);
        if (index != -1) {
            //If index is not equal to -1, then
            String substring = inputString.substring(index + prefix.length());

            //Refer to Array lecture about .length
            //Refer to Section 6.8 of the book for indexof() Method

            System.out.println("Substring after prefix: " + substring);
        } else {
            System.out.println("Prefix not found in the string.");
        }
    }

    public static void outputSubstringBeforeSuffix() { //Choice 5
        System.out.print("Enter suffix: ");
        String suffix = scanner.nextLine();
        int index = inputString.indexOf(suffix);
        if (index != -1) {
            String substring = inputString.substring(0, index);
            System.out.println("Substring before suffix: " + substring);
        } else {
            System.out.println("Suffix not found in the string.");
        }
    }

    public static void outputSubstringBeforeAndAfterPrefixAndSuffix() {
        //Choice 6

        System.out.print("Enter prefix: ");
        String prefix = scanner.nextLine();
        System.out.print("Enter suffix: ");
        String suffix = scanner.nextLine();
        int prefixIndex = inputString.indexOf(prefix);
        int suffixIndex = inputString.indexOf(suffix);

        if (prefixIndex != -1 && suffixIndex != -1 && prefixIndex < suffixIndex) {
            String beforePrefix = inputString.substring(0, prefixIndex);
            String afterSuffix = inputString.substring(suffixIndex + suffix.length());
            System.out.println("Substring before prefix: " + beforePrefix);
            System.out.println("Substring after suffix: " + afterSuffix);
        } else {
            System.out.println("Prefix or suffix not found in the correct order in the string.");
        }
    }

    public static void exitProgram() {
        System.out.println("Exiting the program.");



        /* notes on how to close an endless loop:

         The reason for the endless loop is the while (true) loop in your main method.
         This loop will continue indefinitely because the condition true is always true.
         To terminate the program, you can use System.exit(0) inside the exitProgram() method,
         which forcefully terminates the program. While not the most ideal method, it does still work.

         Instead, we can use a flag method. To create a flag, create a Boolean with "whatever" as true.
         While "whatever" is true in the while loop, the program will continue to run until false.
         Place the false statement in the exit program (of the while loop)to stop the program
         from running further!

         the indexOf method is a commonly used method in Java for finding the index of a specific
         substring within a string.
         */
    }
}
