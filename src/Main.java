import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Where are you from?");
        String location = input.nextLine();

        System.out.println("What us your age?");
        int age = input.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old." );
                System.out.println("You are also from: " + location);

    }
}