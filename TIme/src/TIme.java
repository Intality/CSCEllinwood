//My code to compile:
class Time {
    //public class time error: java: class Time is public, should be declared in a file named Time.java
    private int hours;
    private int minutes;
    private int seconds;
    //The classes are private because they are not meant to be instantiated outside of this class


    // Default constructor
    public Time() { //Default constructor to set time to midnight
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor with hours, minutes, and seconds
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours; // Set hours
        this.minutes = minutes; // Set minutes
        this.seconds = seconds; // Set seconds
        normalizeTime(); // Normalize time after incrementing seconds
    }

    // Increment time by seconds
    public void increment(int sec) {
        this.seconds += sec; // Add seconds
        normalizeTime(); // Normalize time after incrementing seconds
    }

    // Print the time in either 24-hour or 12-hour format
    public void print(boolean military) {
        if (military) {
            System.out.printf("%02d:%02d:%02d\n", this.hours, this.minutes, this.seconds);
            // %02d:%02d:%02d prints hours, minutes, seconds in 24-hour format with leading zeros
        } else {
            int hours = this.hours % 12; // Handle 12-hour format
            if (hours == 0) hours = 12; // Handle midnight and noon case
            String ampm = (this.hours < 12) ? "AM" : "PM"; // Determine AM/PM
            System.out.printf("%02d:%02d:%02d %s\n", hours, this.minutes, this.seconds, ampm);
        }
    }

    // Normalize the time
    private void normalizeTime() {
        int extraMinutes = this.seconds / 60; // Calculate extra minutes from seconds
        this.seconds %= 60; // Set remaining seconds
        this.minutes += extraMinutes; // Add extra minutes
        int extraHours = this.minutes / 60; // Calculate extra hours from minutes
        this.minutes %= 60; // Set remaining minutes
        this.hours += extraHours; // Add extra hours
        this.hours %= 24; // Ensure hours wraps around correctly
        //private because it is only used within this class
    }

    // Static method to create a Time object from a string
    public static Time fromString(String timeString) {
        String[] parts = timeString.split(":");
        // Split the string on colon to extract hours, minutes, seconds

        int hours = Integer.parseInt(parts[0]); // Extract hours
        int minutes = Integer.parseInt(parts[1]); // Extract minutes
        int seconds = Integer.parseInt(parts[2]); // Extract seconds
        return new Time(hours, minutes, seconds); // Construct and return new Time object
    }
}
