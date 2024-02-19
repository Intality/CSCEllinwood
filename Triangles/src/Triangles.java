import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("Welcome to the Triangles program!");

            int size;
            char fillChar;

            // Get size of the triangle from the user
            while (true) {
                System.out.print("Enter the size of the triangle (1-50): ");
                size = scanner.nextInt();
                if (size >= 1 && size <= 50) {
                    break;
                } else {
                    System.out.println("Size must be between 1 and 50. Please try again.");
                }
            }

            // Get fill character from the user
            System.out.print("Enter the character to use for drawing the triangle: ");
            fillChar = scanner.next().charAt(0);

            // Draw the triangle
            System.out.println("Drawing the triangle:");
            drawTriangle(size, fillChar);

            // Ask if the user wants to run the program again
            System.out.print("Do you want to run the program again? (yes/no): ");
            String choice = scanner.next();
            repeat = choice.equalsIgnoreCase("yes");
        }

        System.out.println("Exiting the Triangles program.");
        scanner.close();
    }

    public static void drawTriangle(int size, char fillChar) {
        for (int i = 1; i <= size; i++) {
            // Print spaces to center the triangle
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            // Print fill characters with spaces between them
            for (int k = 0; k < 2 * i - 1; k++) {
                if (k % 2 == 0) {
                    System.out.print(fillChar);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}