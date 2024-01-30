import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

               final double CM_PER_INCH =2.54;
               final double KM_PER_INCH=3;
                       Scanner in= new Scanner(System.in);
                       System.out.println("Give me an amount in inches");
                       int inches= in.nextInt();

                       System.out.println(inches*CM_PER_INCH+ "centimeters");
        System.out.println(inches*KM_PER_INCH+ "Kilometers");
        }
    }
