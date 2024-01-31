//Create a program that converts a given temperature in °F (Fahrenheit), into a given temperature in Celsius and Kelvin
// Use the equation °C = (°F - 32) × 5/9 to convert from Fahrenheit to Celsius
//To convert from Celsius to Kelvin, add 273.15


import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {

        final double FAHRENHEIT_TO_CELSIUS_FRACTION= 0.556;
        //Because java does not understand fractions, or from what I have understood so far in this course, we must manually take 5/9 which equates to .555 repeatedly.
//The more decimals you have, the more accurate the conversion will be, but not necessarily needed in this case.

final double Kelvin=273.15;
//This is to take our output Celsius and add 273.15 to get the temperature in Kelvin

        Scanner in= new Scanner(System.in);
        System.out.println("Give me a temperature in Fahrenheit, as a whole number.");
        int Fahrenheit= in.nextInt();
        //What this is doing is when the program is run, it is waiting for some input: some degree temperature Fahrenheit.
        //*NOTE: WE are not changing the "Give me a temperature in Fahrenheit" at all. This is simply a statement that is asking for some valid input when ran.

        System.out.println((Fahrenheit-32)*(FAHRENHEIT_TO_CELSIUS_FRACTION)+ " Celsius");
        //We are telling the program to take our input Fahrenheit, and give use the output as some converted temperature Celsius.


        System.out.println(((Fahrenheit-32)*FAHRENHEIT_TO_CELSIUS_FRACTION)+Kelvin+ " Kelvin");
//Now that we have computed our temperature in Celsius, we are then telling the program to take that number and add 273.15.
        //From there, we are telling it to give us that computed number in degrees Kelvin!



    }
}
