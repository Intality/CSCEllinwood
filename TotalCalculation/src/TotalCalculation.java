import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TotalCalculation {
    public static void main(String[] args) {
        double subtotal = 0.0; // Start the subtotal at zero
        final double TAX_RATE = 0.053; // Set the tax rate as 5.3%

        // Open and read from the file "items.txt"
        try (Scanner scanner = new Scanner(new File("items.txt"))) {
            while (scanner.hasNextDouble()) {
                subtotal += scanner.nextDouble(); // Keep the sum of each double found, and add to subtotal
            }

            double tax = subtotal * TAX_RATE; // Calculate the tax
            double finalTotal = subtotal + tax; // Calculate the final total

            // Write results to "total.txt"
            try (PrintWriter writer = new PrintWriter(new File("total.txt"))) {
                writer.printf("The Subtotal is: $%.2f\n", subtotal);
                writer.printf("The Tax is: $%.2f\n", tax);
                writer.printf("The Total (Grand Total) is: $%.2f\n", finalTotal);
            }

        } catch (FileNotFoundException e) {
            // If file is not found, print file not found.
            System.out.println("Error: File not found.");
        }
    }
}
