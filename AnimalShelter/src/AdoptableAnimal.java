public interface AdoptableAnimal {
    String getName();

    String getDescription();

    double getPrice();
}
/* Your `AdoptableAnimal` interface should contain the following:

1. A `getName` method that returns a string ✔️
2. A `getDescription` method that returns a string ✔️
3.  A `getPrice` method that returns a double✔️
 */


/*
A public interface in Java is a special type of blueprint for a class. It's a way to define a contract or a set of
methods that a class agrees to implement. Interfaces are abstract by nature, meaning they cannot be instantiated
themselves but instead allow a class to inherit from them by implementing the methods defined within the interface.
The public keyword makes the interface accessible from any other class in any package, as long as the classes are
within the same project or the interface is included as a dependency.
 */