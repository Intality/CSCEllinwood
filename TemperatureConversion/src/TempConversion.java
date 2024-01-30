//Create a program that converts a given temperature in °F (Fahrenheit), into a given temperature in Celsius and Kelvin
// Use the equation °C = (°F - 32) × 5/9 to convert from Fahrenheit to Celsius
//To convert from Celsius to Kelvin, add 273.15


import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {

        final double Melting_point_of_water =32;
        //This is to set the melting or freezing point of water, so we get whatever °F that we input subtracted from 32

        final double Fahrenheit_to_Celsius_Fraction= 0.556;
        //Because java does not understand fractions, or from what I have understood so far in this course, we must manually take 5/9 which equates to .555 repeatedly.
//The more decimals you have, the more accurate the conversion will be, but not necessarily needed in this case.

final double Kelvin=273.15;
//This is to take our output Celsius and add 273.15 to get the temperature in Kelvin

        Scanner in= new Scanner(System.in);
        System.out.println("Give me a temperature in Fahrenheit, as a whole number.");
        int Fahrenheit= in.nextInt();
        //What this is doing is when the program is run, it is waiting for some input: some degree temperature Fahrenheit.
        //*NOTE: WE are not changing the "Give me a temperature in Fahrenheit" at all. This is simply a statement that is asking for some valid input when ran.


        System.out.println((Fahrenheit-Melting_point_of_water)*Fahrenheit_to_Celsius_Fraction  + " Celsius");
        //We are telling the program to take our formula of (°F - 32) × 5/9 and compute it.
        //The computed result will print out with the temperature in degrees Celsius or °C.

        System.out.println(((Fahrenheit-Melting_point_of_water)*Fahrenheit_to_Celsius_Fraction)+Kelvin+ " Kelvin");
//Now that we have computed our temperature in Celsius, we are then telling the program to take that number and add 273.15.
        //From there, we are telling it to give us that computed number in degrees Kelvin!

    }
}