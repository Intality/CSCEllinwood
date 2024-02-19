import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which drink would you like? ");

        //Separated println's for drinks to provide a cleaner look when program is ran.
        System.out.println("Choose 1 for water");
        System.out.println("Choose 2 for Coke");
        System.out.println("Choose 3 for Coffee");
        double beverage = input.nextDouble();

        //Need beverage to be == and not >= or <= because we are saying that the choices are defined as 1, 2, or 3

        if (beverage == 1) {
            System.out.println("You Chose water");
        } else if (beverage == 2) {
            System.out.println("You chose Coke");
        } else if (beverage == 3) {
            System.out.println("You chose coffee");

        } else {
            System.out.println("Invalid entry. Please try again!");
            //If I choose 2.1, does it display an error? Yes. it gives invalid entry!
        }
    }
}

/* Ok so I need a program that asks for input, so I need a scanner! Done.
Now I need If/else-if statements to print out choices. Done!
Else should be invalid entry, because choices are defined!
 */