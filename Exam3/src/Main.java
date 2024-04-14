import java.util.ArrayList;

// Base class Person
class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    // Constructor
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Using toString method to represent the object as a string
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber + ", Email: " + emailAddress;
    }
}

// Subclass Student inheriting from Person
class Student extends Person {
    private String status;

    // Constructor
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

//Public or protected won't work. Why can't I just use class like the student or person?
/* Abstract class: is a restricted class that cannot be used to create objects
(to access it, it must be inherited from another class). Abstract method: can only be used in an abstract class,
and it does not have a body.
 */

abstract class Employee extends Person {
    private String department;
    private double monthlySalary;
    private String dateHired;

    // Constructor
    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getEmployeeType();
}

// Subclass Faculty inheriting from Employee
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    // Constructor
    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String department, double monthlySalary, String dateHired,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }


    public String getOfficeHours() {
        return officeHours;
    }


    public String getRank() {
        return rank;
    }

    @Override
    public String getEmployeeType() {
        return "Faculty";
    }
}


class Staff extends Employee {
    private String title;


    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String department, double monthlySalary, String dateHired,
                 String title) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.title = title;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    @Override
    public String getEmployeeType() {
        return "Staff";
    }
}

// TestSchoolRecords class
class TestSchoolRecords {

    public static void main(String[] args) {
        // Create an ArrayList of persons
        ArrayList<Person> persons = new ArrayList<>();

        // Add 2 students
        persons.add(new Student("Josh Allen", "123 Main St", "123-456-7890", "josh.allen@gmail.com", "freshman"));
        persons.add(new Student("Stefon Digs", "456 Second Ave", "987-654-3210", "sefon.diggs@yahoo.com", "sophomore"));

        // Add 2 faculty
        persons.add(new Faculty("Dr. Evil", "789 Ash Ct", "111-222-3333", "dr.evil@iamgreat.xyz",
                "World Studies", 6000.0, "2023-01-15", "Monday 2-4pm", "Senior"));
        persons.add(new Faculty("Prof. Proton", "321 Pine St", "444-555-6666", "prof.proton@pbs.com",
                "Physics", 5500.0, "2022-08-20", "Wednesday 10am-12pm", "Junior"));

        // Add 2 staff
        persons.add(new Staff("Alan Parsons", "555 Cedar St", "777-888-9999", "alanparson@harvard.edu",
                "Administration", 4500.0, "2024-03-01", "Administrative Assistant"));
        persons.add(new Staff("Bob Barker", "999 Maple St", "222-333-4444", "bob.barker@gmail.com",
                "Library", 4000.0, "2023-11-10", "Librarian"));

        // Traverse the list of persons and print details using toString method
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        // Get employees from the list of persons
        ArrayList<Person> employees = getEmployees(persons);
        System.out.println("\nEmployees List:");
        for (Person employee : employees) {
            System.out.println(employee.toString());
        }
    }

    // Function to filter employees from a list of persons
    public static ArrayList<Person> getEmployees(ArrayList<Person> persons) {
        ArrayList<Person> employees = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Employee) {
                employees.add(person);
            }
        }
        return employees;
    }
}
