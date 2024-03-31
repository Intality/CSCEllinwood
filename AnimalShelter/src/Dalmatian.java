public class Dalmatian extends Dog {
    public Dalmatian(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getBreed() {
        return "Dalmatian";
    }
}
