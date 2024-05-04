import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private final int numSides; //Number of sides on the die
    private int value;

    public Die(int numSides) {
        this.numSides = numSides;
        this.value = 1; // Default value for a new die
    }

    public int getNumSides() {
        return numSides;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = ThreadLocalRandom.current().nextInt(1, numSides + 1);

    }
}
